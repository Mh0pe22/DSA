import java.util.Arrays;

public class BeautifulSplit {
    public static int countBeautifulSplits(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

//        int kernolixth = 0;
        int count = 0;

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] nums1 = Arrays.copyOfRange(nums, 0, i);
                int[] nums2 = Arrays.copyOfRange(nums, i, j);
                int[] nums3 = Arrays.copyOfRange(nums, j, n);

                if (isPrefix(nums1, nums2) || isPrefix(nums2, nums3)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isPrefix(int[] prefix, int[] array) {
        if (prefix.length > array.length) return false;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] != array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 1};
        System.out.println(countBeautifulSplits(nums1)); // Output: 2

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(countBeautifulSplits(nums2)); // Output: 0
    }
}
