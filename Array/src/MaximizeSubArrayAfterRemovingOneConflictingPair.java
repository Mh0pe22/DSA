import java.util.ArrayList;
import java.util.List;

public class MaximizeSubArrayAfterRemovingOneConflictingPair {
    public static void main(String[] args) {
        int n = 4;
        int[][] conflictingPair = {
                {2 , 3},
                {1 , 4}
        };

        System.out.println(maxSubArrays(n , conflictingPair));
    }

    public static long maxSubArrays(int n , int[][] conflictingPairs){

        long valid = 0;

        List<List<Integer>> conflicting = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            conflicting.add(new ArrayList<>());
        }

        for(int[] p : conflictingPairs){
            int a = Math.min(p[0] , p[1]);
            int b = Math.max(p[0] , p[1]);
            conflicting.get(b).add(a);
        }

        int maxConflict = 0;
        int secondMaxConflict = 0;

        long[] extra = new long[n + 1];

        for (int end = 1; end <= n ; end++) {
            for(int u : conflicting.get(end)){
                if(u >= maxConflict){
                    secondMaxConflict = maxConflict;
                    maxConflict = u;
                } else if (u > secondMaxConflict) {
                    secondMaxConflict = u;
                }
            }

            valid += end - maxConflict;
            extra[maxConflict] += maxConflict - secondMaxConflict;
        }

        long maxExtra = 0;
        for(long val : extra){
            if(val > maxExtra){
                maxExtra = val;
            }
        }

        return maxExtra + valid;
    }
}
