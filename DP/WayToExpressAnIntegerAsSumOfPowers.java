import java.util.Arrays;

public class WayToExpressAnIntegerAsSumOfPowers {
    public static void main(String[] args) {
        int n = 4;
        int x = 1;
        System.out.println(numberOfWays(n, x));
    }

    private static int MOD = (int) (1e9 + 7);
    private static int[][] dp;
    public static int numberOfWays(int n , int x){
        dp = new int[301][301];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }

        return solve(n , 1 , x);
    }

    private static int solve(int n , int num , int x){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        int currentPower = (int)Math.pow(num , x);
        if(currentPower > n){
            return 0;
        }

        if(dp[n][num] != -1){
            return dp[n][num];
        }

        int take = solve(n - currentPower , num + 1 , x);
        int note_take = solve(n , num + 1 , x);

        return dp[n][num] = (take + note_take) % MOD;
    }
}
