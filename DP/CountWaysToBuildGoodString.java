import java.util.Arrays;

public class CountWaysToBuildGoodString {
    public static void main(String[] args) {

        int low = 3;
        int high = 3;
        int zero = 1;
        int one = 2;
        System.out.println(countGoodString(low , high , zero , one));
    }

    public static  int L , H , Z , O;
    public static int MOD = 1_000_000_007;

    public static int[] dp ;
    public static int countGoodString(int low , int high , int zero , int one){




        L = low ;
        H = high;
        Z = zero;
        O = one;

        dp = new int[H + 1];
        Arrays.fill(dp , -1);

        return solve(0);

    }

    public static int solve(int l){
        if(l > H){
            return 0;
        }

        if(dp[l] != -1){
            return dp[l];
        }

        boolean add_1 = false;
        if(l >= L){
            add_1 = true;
        }

        int add_zero = solve(l + Z);
        int add_one = solve(l + O);

        return dp[l] = ((add_1 ? 0 : 1) + add_one + add_zero)%MOD;
    }
}
