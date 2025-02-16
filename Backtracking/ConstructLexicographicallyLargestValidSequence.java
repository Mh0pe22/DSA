import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class ConstructLexicographicallyLargestValidSequence {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(constructDistancedSequence(n)));
    }

    public static int[] constructDistancedSequence(int n){
        int[] result = new int[2 * n - 1];
        Arrays.fill(result , -1);

        boolean[] used = new boolean[n + 1];

        solve(0 , n , result ,used);

        return result;
    }

    public static boolean solve(int i, int n , int[] result , boolean[] used){
        if(i >= result.length){
            return true;
        }

        if(result[i] != -1){
            return solve(i + 1, n , result , used);
        }

        for (int j = n; j >= 1; j--) {
            if(used[j]){
                continue;
            }

            used[j] = true;
            result[i] = j;

            if(j == 1){
                if(solve(i + 1, n , result , used)){
                    return true;
                }
            }else{
                int k = result[i] + i;
                if(k < result.length && result[k] == -1){
                    result[k] = j;
                    if (solve(i + 1, n, result, used)) {
                        return true;
                    }
                    result[k] = -1;
                }
            }
            used[j] = false;
            result[i] = -1;
        }
        return false;
    }
}
