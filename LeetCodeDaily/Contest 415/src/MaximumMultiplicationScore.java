import java.util.Arrays;
import java.util.Map;

public class MaximumMultiplicationScore {
    public static void main(String[] args) {
        int[] a = {3,2,5,6};
        int[] b= {2,-6,4,-5,-3,2,-7};
        System.out.println(maxScore(a,b));
    }


    public static long maxScore(int[] a, int[] b){

//        long dp0 = Long.MIN_VALUE / 2;
//        long dp1 = Long.MIN_VALUE / 2;
//        long dp2 = Long.MIN_VALUE / 2;
//        long dp3 = Long.MIN_VALUE / 2;
//
//        for (int i = 0; i < b.length; i++) {
//            // Update dp3: the maximum score with 4 elements from a
//            if (i >= 3) {  // Ensure that we're at least at the 4th element to update dp3
//                dp3 = Math.max(dp3, dp2 + (long) a[3] * b[i]);
//            }
//            // Update dp2: the maximum score with 3 elements from a
//            if (i >= 2) {  // Ensure that we're at least at the 3rd element to update dp2
//                dp2 = Math.max(dp2, dp1 + (long) a[2] * b[i]);
//            }
//            // Update dp1: the maximum score with 2 elements from a
//            if (i >= 1) {  // Ensure that we're at least at the 2nd element to update dp1
//                dp1 = Math.max(dp1, dp0 + (long) a[1] * b[i]);
//            }
//            // Update dp0: the maximum score with 1 element from a
//            dp0 = Math.max(dp0, (long) a[0] * b[i]);
//        }
//
//        // Return the maximum score possible by choosing 4 elements
//        return dp3;

        long[][] dp = new long[a.length][b.length];
        for (long[] row : dp){
            Arrays.fill(row , Long.MIN_VALUE);
        }
        return rec(0 , 0 ,a , b , b.length , dp);
    }

    public static long rec(int i , int j ,int[] a, int[] b , int n , long[][] dp){

        if(i == 4){
            return 0;
        }

        if(j >= n){
            return (long) -1e11;
        }

        if(dp[i][j] != Long.MIN_VALUE){
            return dp[i][j];
        }
        long x = ((long) a[i] * b[j]) + rec(i + 1 , j + 1 , a , b, n , dp);
        long y = rec(i , j + 1, a , b , n , dp);

       dp[i][j] = Math.max(x , y);

       return dp[i][j];
    }
}
