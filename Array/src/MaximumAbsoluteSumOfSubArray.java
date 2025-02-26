public class MaximumAbsoluteSumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {1 , 2, -3 , 5, -2};
        System.out.println(maxAbsoluteSum(nums));
    }

    public static int maxAbsoluteSum(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i] , currSum + nums[i]);
            maxSum = Math.max(currSum , maxSum);
        }

        currSum = nums[0];
        int minSum = nums[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.min(nums[i] , currSum + nums[i]);
            minSum = Math.min(currSum , minSum);
        }

        return Math.max(Math.abs(maxSum) , Math.abs(minSum));

    }
}
