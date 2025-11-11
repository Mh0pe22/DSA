import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    static void main() {
        String strs[] = {"10","0001","111001","1","0"};
        int m = 5;
        int n = 3;
        System.out.println(findMaxForm(strs,m,n));
    }

    private static int[][][] dp;

    private static int solve(int[][] count, int m, int n, int index) {
        if (index >= count.length || (m == 0 && n == 0))
            return 0;

        if (dp[m][n][index] != -1)
            return dp[m][n][index];

        int include = 0;
        if (count[index][0] <= m && count[index][1] <= n) {
            include = 1 + solve(count, m - count[index][0], n - count[index][1], index + 1);
        }

        int exclude = solve(count, m, n, index + 1);

        return dp[m][n][index] = Math.max(include, exclude);
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int L = strs.length;
        int[][] count = new int[L][2]; // count[i][0] = zeros, count[i][1] = ones

        for (int i = 0; i < L; i++) {
            int zeros = 0, ones = 0;
            for (char ch : strs[i].toCharArray()) {
                if (ch == '0')
                    zeros++;
                else
                    ones++;
            }
            count[i][0] = zeros;
            count[i][1] = ones;
        }

        dp = new int[m + 1][n + 1][L];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(count, m, n, 0);
    }

}
