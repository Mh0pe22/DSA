import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class FindTheMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = {
                {1,3},
                {2,2}
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid){

        int m = grid.length;
        int n = grid[0].length;
        int len  = m * n;
        HashSet<Integer> set =  new HashSet<>();
        for (int i = 1; i <= len; i++) {
            set.add(i);
        }

        int repeated = 0;
        int missing = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(set.contains(grid[i][j])){
                    set.remove(grid[i][j]);
                }else{
                    repeated = grid[i][j];
                }
            }
        }

        missing = set.iterator().next();
        return new int[]{repeated , missing};
    }
}
