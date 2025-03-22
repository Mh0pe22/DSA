import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountTheNumberOfCompleteComponents {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
                {0 , 1},
                {1 , 2},
                {0 , 2},
                {3 , 4}
        };
        System.out.println(countCompleteComponents(n , edges));
    }

    public static int countCompleteComponents(int n, int[][] edges){
        HashMap<Integer , List<Integer>> adj = new HashMap<>();
        int result = 0;

        for(int[] edge : edges){
            adj.computeIfAbsent(edge[0] , k -> new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1] , k-> new ArrayList<>()).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]){
                continue;
            }

            int[] info = new int[2];
            dfs(i , adj , visited , info);

            if(info[0] * (info[0] - 1) == info[1]){
                result++;
            }
        }
        return result;
    }

    public static void dfs(int i , HashMap<Integer , List<Integer>> adj , boolean[] visited , int[] info ){
        visited[i] = true;
        info[0]++;
        info[1] += adj.getOrDefault(i , new ArrayList<>()).size();

        for(int ngbr : adj.getOrDefault(i , new ArrayList<>())){
            if(!visited[ngbr]){
                dfs(ngbr , adj , visited , info);
            }
        }
    }
}
