import java.util.*;

public class LargestColorValueInADirectedGraph {
    public static void main(String[] args) {
        String colors = "abaca";
        int[][] edges = {
                {0 , 1},
                {0 , 2},
                {2 , 3},
                {3 , 4}
        };
        System.out.println(largestPathValue(colors , edges));
    }

    public static int largestPathValue(String colors , int[][] edges){
        Map<Integer , List<Integer>> adj= new HashMap<>();
        int n = colors.length();
        int[] indegree = new int[n];

        for(int[] vec : edges){
            int u = vec[0];
            int v = vec[1];

            adj.putIfAbsent(u , new ArrayList<>());
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> que = new LinkedList<>();
        int[][] t = new int[n][26];

        for (int i = 0; i < n; i++) {
            if(indegree[i] == 0){
                que.add(i);
                t[i][colors.charAt(i) - 'a'] = 1;
            }
        }

        int answer = 0;

        int countNodes = 0;
        while (!que.isEmpty()) {
            int u = que.poll();
            countNodes++;
            answer = Math.max(answer, t[u][colors.charAt(u) - 'a']);

            List<Integer> neighbors = adj.get(u);
            if (neighbors != null) {
                for (int v : neighbors) {
                    for (int i = 0; i < 26; i++) {
                        int add = ((colors.charAt(v) - 'a') == i) ? 1 : 0;
                        t[v][i] = Math.max(t[v][i], t[u][i] + add);
                    }
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        que.add(v);
                    }
                }
            }
        }

        if(countNodes < n){
            return -1;
        }
        return answer;
    }
}
