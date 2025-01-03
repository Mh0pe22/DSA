import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {

    }

    public static int[][] dp = new int[201][201];
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        for(int[] row : dp){
            Arrays.fill(row , -1);
        }

        return solve(grid , 0, 0, m , n);
    }

    public static int solve(int[][] grid , int i , int j , int m , int n){
        if(i == m - 1 && j == n - 1){
            return dp[i][j] = grid[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(i == m-1){
            return dp[i][j] = grid[i][j] + solve(grid , i ,j + 1 , m , n);
        } else if (j == n - 1) {
            return dp[i][j] = grid[i][j] + solve(grid , i + 1 , j , m ,n);
        }else{
            return dp[i][j] = grid[i][j] + Math.min(solve(grid , i + 1 , j , m, n) , solve(grid , i , j + 1 , m, n));
        }

    }
}
