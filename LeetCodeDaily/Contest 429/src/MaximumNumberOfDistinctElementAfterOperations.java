import java.util.Arrays;

public class MaximumNumberOfDistinctElementAfterOperations {
    public static void main(String[] args) {

    }

    public static int maxDistinctElements(int[] nums, int k){
        Arrays.sort(nums);

        int count = 0;
        int nextDistinct = Integer.MIN_VALUE; // Track the next smallest valid distinct value

        for (int num : nums) {
            // Calculate the smallest valid value within the range [num - k, num + k]
            int start = Math.max(nextDistinct, num - k);
            int end = num + k;

            // If the current range [start, end] can provide a valid distinct value
            if (start <= end) {
                count++;
                nextDistinct = start + 1; // Update the next smallest valid value
            }
        }

        return count;
    }
}
