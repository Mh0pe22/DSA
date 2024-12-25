package Biweekly146;

import java.util.HashMap;
import java.util.Map;

public class CountPathWithGivenXORValue {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,5},
                {7,10,0},
                {12,6,4},
        };

        int k = 11;
        System.out.println(countPathsWithGivenXORValue(grid , k));
    }

    private static final int MOD = 1_000_000_007;
    public static  int countPathsWithGivenXORValue(int[][] grid , int k){

        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][16];

        // Start at the top-left corner
        dp[0][0][grid[0][0]] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int currentXOR = 0; currentXOR < 16; currentXOR++) {
                    if (dp[i][j][currentXOR] > 0) {
                        // Move right if possible
                        if (j + 1 < n) {
                            int newXOR = currentXOR ^ grid[i][j + 1];
                            dp[i][j + 1][newXOR] = (dp[i][j + 1][newXOR] + dp[i][j][currentXOR]) % MOD;
                        }

                        // Move down if possible
                        if (i + 1 < m) {
                            int newXOR = currentXOR ^ grid[i + 1][j];
                            dp[i + 1][j][newXOR] = (dp[i + 1][j][newXOR] + dp[i][j][currentXOR]) % MOD;
                        }
                    }
                }
            }
        }
        return dp[m - 1][n - 1][k];
    }
}
