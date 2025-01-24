import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
    public static void main(String[] args) {
        int[][] graph = {
                {1,2},
                {2,4},
                {2,3}
        };

        System.out.println(eventualSafeNode(graph));
    }

    public static List<Integer> eventualSafeNode(int[][] graph){
        int V = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
            for(int v : graph[i]){
                adj.get(i).add(v);
            }
        }

        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                isCycleDFS(adj, i, visited, inRecursion);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (!inRecursion[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    public static boolean isCycleDFS(List<List<Integer>> adj , int u , boolean[] visited , boolean[] inRecursion){
        visited[u] = true;
        inRecursion[u] = true;

        for(int v: adj.get(u)){
            if(!visited[v] && isCycleDFS(adj , v, visited, inRecursion)){
                return true;
            } else if (inRecursion[v]) {
                return true;
            }
        }

        inRecursion[u] = false;
        return false;
    }
}
