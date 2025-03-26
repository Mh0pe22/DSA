import java.util.Arrays;

public class MinimumOperationToMakeUniValueGrid {
    public static void main(String[] args) {
    int[][] grid = {
            {2 , 4},
            {6, 8}
    };
    int x = 2;
        System.out.println(minOperations(x , grid));
    }

    public static int minOperations(int x , int[][] grid){

        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m * n];
        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k] = grid[i][j];
                k++;
            }
        }

        int ans = 0;
        Arrays.sort(arr);
        int target = arr[arr.length / 2];


        for(int i : arr){
            if(i % x != target%x){
                return -1;
            }

            ans += Math.abs(target - i) / x;
        }

        return ans;
    }
}
