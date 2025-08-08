import java.util.Arrays;

public class SoupServing {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(soupServing(n));
    }

    public static double soupServing(int n){

        if(n >= 5000){
            return 1.0;
        }

        dp = new double[n + 1][n + 1];
        for(double[] i : dp){
            Arrays.fill(i , -1.0);
        }

        return solve(n , n);
    }

    private static int[][] val = {{100 , 0} , {75 , 25} , {50 , 50} , {25 , 75}};
    private static double[][] dp ;
    public static double solve(int A , int B){
        if(A <=  0 && B <= 0){
            return 0.5;
        }

        if(A <= 0){
            return 1.0;
        }

        if (B <= 0){
            return 0.0;
        }

        if(dp[A][B] != -1.0){
            return dp[A][B];
        }

        double prob = 0.0;
        for(int[] i : val){
            int A_taken = i[0];
            int B_taken = i[1];

            prob += solve(A - A_taken , B - B_taken);
        }

        return dp[A][B] = 0.25 * prob;

    }
}
