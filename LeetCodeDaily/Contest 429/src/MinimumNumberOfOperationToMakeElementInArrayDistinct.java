import java.util.Arrays;
import java.util.HashSet;

public class MinimumNumberOfOperationToMakeElementInArrayDistinct {

    public static void main(String[] args) {

        int[] nums = {4,5,6,4,4};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums){

        int operations = 0;

        while (true) {
            // Create a set to track unique elements
            HashSet<Integer> seen = new HashSet<>();
            boolean allDistinct = true;

            // Check the current array for duplicates
            for (int num : nums) {
                if (num != -1 && seen.contains(num)) {
                    allDistinct = false;
                    break;
                }
                seen.add(num);
            }

            // If all elements are distinct, stop
            if (allDistinct) {
                return operations;
            }

            // Perform one operation: remove up to 3 elements from the start
            int removed = 0;
            for (int i = 0; i < nums.length; i++) {
                if (removed < 3 && nums[i] != -1) {
                    nums[i] = -1; // Mark as removed
                    removed++;
                }
            }

            // Increment the operation count
            operations++;
        }
    }
}
