import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroArrayTransformation2 {
    public static void main(String[] args) {
        int[] nums = {2 , 0 ,2};
        int[][] queries = {
                {0 , 2, 1},
                {0 , 2, 1},
                {1 , 1, 3}
        };
        System.out.println(minZeroArrays(nums , queries));
    }

    public static int minZeroArrays(int[] nums , int[][] queries){
        int n = nums.length;
        int Q = queries.length;

        if(Arrays.stream(nums).allMatch(x -> x == 0)){
            return 0;
        }

        int l = 0;
        int r = Q - 1;
        int k =-1;
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(checkWithDifferenceTeq(nums , queries , mid)){
                k = mid + 1;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return k;
    }

    public static boolean checkWithDifferenceTeq(int[] nums , int[][] queries , int k){
        int[] diff = new int[nums.length];

        for (int i = 0; i <= k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];

            diff[l] += x;
            if(r + 1 < nums.length){
                diff[r + 1] -= x;
            }
        }

        int cumSum = 0;
        for (int i = 0; i < nums.length; i++) {
            cumSum += diff[i];
            diff[i] = cumSum;

            if(nums[i] - diff[i] > 0){
                return false;
            }

        }
        return true;
    }
}
