import java.util.Arrays;
import java.util.Map;

public class MaximumMultiplicationScore {
    public static void main(String[] args) {
        int[] a = {3,2,5,6};
        int[] b= {2,-6,4,-5,-3,2,-7};
        System.out.println(maxScore(a,b));
    }


    public static long maxScore(int[] a, int[] b){

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
