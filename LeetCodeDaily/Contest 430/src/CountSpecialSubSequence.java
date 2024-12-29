import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSpecialSubSequence {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 3, 4, 3, 4};
        System.out.println(numberOfSubSequences(arr));
    }

    public static long numberOfSubSequences(int[] nums) {
        long count = 0;
        int n = nums.length;

        // Iterate through all possible values of q
        for (int q = 2; q < n - 2; q++) {
            // Create a map to store products of nums[q] * nums[s]
            HashMap<Long, Integer> productMap = new HashMap<>();

            // Iterate for s
            for (int s = q + 2; s < n; s++) {
                long rightProduct = (long) nums[q] * nums[s];
                productMap.put(rightProduct, productMap.getOrDefault(rightProduct, 0) + 1);
            }

            // Iterate for p
            for (int p = 0; p < q - 1; p++) {
                // Iterate for r
                for (int r = q + 2; r < n; r++) {
                    long leftProduct = (long) nums[p] * nums[r];

                    // Check if the product exists in the map
                    if (productMap.containsKey(leftProduct)) {
                        count += productMap.get(leftProduct);
                    }
                }
            }
        }

        return count;
    }
}
