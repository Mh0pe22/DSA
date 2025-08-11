import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeProductQueriesOfPowers {
    public static void main(String[] args) {
            int n = 15;
            int[][] queries = {
                    {0 ,1},
                    {2 , 2},
                    {0 , 3}
            };

        System.out.println(Arrays.toString(productQueries(n , queries)));
    }

    public static int[] productQueries(int n, int[][] queries){

        int MOD = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();
        int[] ans = new int[queries.length];

        for (int i = 0; i < 32; i++) {
            if((n & (1 << i) )!= 0){
                powers.add(1 << i);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            long product = 1;
            for (int j = start; j <= end ; j++) {
                product = (product * powers.get(j)) % MOD;
            }

            ans[i] = (int)product;
        }

        return ans;
    }
}
