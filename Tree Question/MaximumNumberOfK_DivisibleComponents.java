import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfK_DivisibleComponents {

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
                {0,2},
                {1,2},
                {1,3},
                {2,4}
        };

        int[] values = {1,8,1,4,4};
        int k = 6;
        System.out.println(maxDivisibleComponents(n , edges , values , k));
    }

    public static int maxDivisibleComponents(int n, int[][] edges , int[] values , int k){
        // adjacency list from edges
        List<Integer>[] adjList = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge: edges){
            int node1 = edge[0];
            int node2 = edge[1];
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }
        int[] componentCount = new int[1];
        dfs(0 , -1 , adjList , values , k , componentCount);

        return componentCount[0];
    }

    public static long dfs(int currentNode , int parentNode , List<Integer>[] adjList , int[] nodeValues , int k, int[] componentCount){
        long sum = 0;
        for(int neighborNode: adjList[currentNode]){
            if(neighborNode != parentNode){
                sum += dfs(neighborNode , currentNode , adjList , nodeValues , k , componentCount);
            }
        }

        sum += nodeValues[currentNode];
        if(sum % k == 0){
            componentCount[0]++;
            sum = 0;
        }

        return sum;
    }

}

