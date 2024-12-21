public class MaximumSubArrayWithLengthDivisibleByK {

    public static void main(String[] args) {

        int[] arr = {1 , 2};
        int k = 1;
        System.out.println(maxSubArraySum(arr , k));
    }

    public static long maxSubArraySum(int[] nums , int k){

        /*
        int n = nums.length;
        long maxSum = Long.MIN_VALUE;

        for (int size = k; size <= nums.length ; size += k) {

            long windowSum = 0;

            for (int i = 0; i < size; i++) {
                windowSum += nums[i];
            }

            maxSum = Math.max(maxSum , windowSum);

            for (int i = size; i < n ; i++) {
                windowSum += nums[i] - nums[i - size];
                maxSum = Math.max(maxSum , windowSum);
            }
        }

        return maxSum;

         */
        int n = nums.length;
        long maxSum = Long.MIN_VALUE;

        // Iterate over groups based on modulo k
        for (int mod = 0; mod < k; mod++) {
            long currentSum = 0;
            long maxForGroup = Long.MIN_VALUE;

            // Iterate over all elements that are part of the current group
            for (int i = mod; i < n; i += k) {
                currentSum += nums[i];
                maxForGroup = Math.max(maxForGroup, currentSum);
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            // Update global maximum
            maxSum = Math.max(maxSum, maxForGroup);
        }

        return maxSum;
    }
}
