import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class LongestSubArrayWithMaximumBitwiseAND {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,2};
        System.out.println(longestSubArray(nums));
    }

    public static int longestSubArray(int[] nums){
        OptionalInt maxBitwiseAnd = Arrays.stream(nums).max();
        int maxSubArrayCount = 0;
        int count = 0;
        for (int num : nums){
            if(num == maxBitwiseAnd.getAsInt()){
                count++;
            }
            if(count > 0 && num != maxBitwiseAnd.getAsInt()){
                maxSubArrayCount = Math.max(maxSubArrayCount , count);
                count = 0;
            }
        }

        maxSubArrayCount = Math.max(maxSubArrayCount , count);
        return maxSubArrayCount;
    }
}
