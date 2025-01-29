import java.util.*;

public class RedundantConnection {
    public static void main(String[] args) {
        int[][] edges = {
                {1,2},
                {1,3},
                {2,3}
        };

        System.out.println(Arrays.toString(findRedundant(edges)));
    }

    public static int[] findRedundant(int[][] edges){
        
        int m = edges.length;

        Map<Integer , List<Integer>> adj = new HashMap<>();

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(adj.containsKey(u) && adj.containsKey(v) && bfs(adj , u , v , m)){
                return edge;
            }

            adj.putIfAbsent(u , new ArrayList<>());
            adj.putIfAbsent(v , new ArrayList<>());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return new int[0];
    }

    public static boolean bfs(Map<Integer , List<Integer>> adj, int start , int end , int m){
        boolean[] visited = new boolean[m + 1];
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);

        while (!que.isEmpty()){
            int curr = que.poll();
            visited[curr] = true;
            if(curr == end){
                return true;
            }

            for(int ngr : adj.get(curr)){
                if(!visited[ngr]){
                    que.offer(ngr);
                }
            }
        }

        return false;
    }
}
