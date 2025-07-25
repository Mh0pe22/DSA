import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarraySumAfterDeletion {
    public static void main(String[] args) {
        int[] nums = {17,13,-4,1,1};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums){
        Set<Integer> uniqueEle = new HashSet<>();
        int maxEle = Integer.MIN_VALUE;
        int maxSubSum = 0;
        for(int i : nums){
            maxEle = Math.max(maxEle , i);
        }

        if(maxEle < 0){
            return maxEle;
        }
        for (int i = 0; i < nums.length; i++) {
            if(uniqueEle.isEmpty() && nums[i] >= 0){
                maxSubSum += nums[i];
                uniqueEle.add(nums[i]);
            } else if (nums[i] >= 0 && !uniqueEle.contains(nums[i])) {
                maxSubSum += nums[i];
                uniqueEle.add(nums[i]);
            }
        }
        return maxSubSum;
    }
}
