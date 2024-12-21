import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumBeautyOfAnArrayAfterApplyingOperation {
    public static void main(String[] args) {

    }

    public static int maximumBeauty(int[] nums , int k){
        int n = nums.length - 1;

        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int maxBeauty = 0;

        while(i < n){
            while(j < n && nums[j] <= nums[i] - 2*k){
                j++;
            }

            maxBeauty = Math.max(maxBeauty , j - i);
            i++;
        }

        return maxBeauty;
    }
}
