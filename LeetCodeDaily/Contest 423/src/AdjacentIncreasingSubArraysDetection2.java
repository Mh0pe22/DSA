import java.util.ArrayList;
import java.util.List;

public class AdjacentIncreasingSubArraysDetection2 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(1);

        int k = 3;
        System.out.println(hasIncreasingSubArrays(a));
    }

    public static int hasIncreasingSubArrays(List<Integer> nums){
        int n = nums.size();
        int left = 1, right = n / 2;

        // Step 1: Precompute lengths of increasing subarrays starting at each index
        int[] lengths = new int[n];
        lengths[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                lengths[i] = lengths[i + 1] + 1;
            } else {
                lengths[i] = 1;
            }
        }

        // Step 2: Binary search for the maximum valid k
        while (left < right) {
            int mid = (left + right + 1) / 2;

            if (isValid(nums, lengths, mid)) {
                left = mid; // Try a larger k
            } else {
                right = mid - 1; // Reduce k
            }
        }

        return left;
    }

    private static boolean isValid(List<Integer> nums, int[] lengths, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            if (lengths[i] >= k && lengths[i + k] >= k) {
                return true;
            }
        }
        return false;
    }
}
