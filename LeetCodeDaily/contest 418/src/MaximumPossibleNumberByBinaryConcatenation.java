import java.util.ArrayList;
import java.util.List;

public class MaximumPossibleNumberByBinaryConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(maxGoodNumber(nums));
    }

    // Main method to find the maximum possible number
    public static int maxGoodNumber(int[] nums) {

        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(nums, 0, permutations);

        return (int) helper(permutations);
    }
    public static long helper(List<List<Integer>> list) {
        long max = 0;

        for (List<Integer> perm : list) {
            StringBuilder sb = new StringBuilder();

            for (int i : perm) {
                sb.append(Integer.toBinaryString(i));
            }

            long currentBinaryValue = Long.parseLong(sb.toString(), 2);
            max = Math.max(max, currentBinaryValue);
        }

        return max;
    }

    public static void generatePermutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            result.add(perm);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, i, start);
                generatePermutations(nums, start + 1, result);
                swap(nums, i, start);
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
