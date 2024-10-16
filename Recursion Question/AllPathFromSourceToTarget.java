import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathFromSourceToTarget {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2},
                {3},
                {3},
                {}
        };

        List<List<Integer>> ans = allPathsSourceTarget(arr);
        for(List i : ans){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;

        int source = 0;
        int target = n - 1;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        dfs(graph , source , target , ans , temp);

        return ans;
    }

    public static void dfs(int[][] graph , int source , int target , List<List<Integer>> ans , List<Integer> temp){
        temp.add(source);

        if(source == target){
            ans.add(new ArrayList<>(temp));
        }else{
            for(int i : graph[source]){
                dfs(graph , i , target , ans , temp);
            }
        }
        temp.removeLast();
    }
}
