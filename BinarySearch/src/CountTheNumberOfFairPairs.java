import java.lang.reflect.Array;
import java.util.Arrays;

public class CountTheNumberOfFairPairs {

    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};

        int lower = 3;
        int upper = 6;
        System.out.println(countFairPairs(nums , lower , upper));
    }

    public static long countFairPairs(int[] nums , int lower , int upper){
        Arrays.sort(nums);

        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            int leftIndex = lowerBound(nums , i + 1, nums.length, lower - nums[i]);
            int rightIndex = upperBound(nums , i + 1, nums.length , upper - nums[i]);

            int x = leftIndex - 1 - i;
            int y = rightIndex - 1 - i;

            result += (y - x);
        }

        return result;
    }

    private static int lowerBound(int[] nums , int start , int end , int target){
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private static int upperBound(int[] nums, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
