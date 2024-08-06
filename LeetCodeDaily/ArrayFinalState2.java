import java.util.Arrays;

public class ArrayFinalState2 {
    public static void main(String[] args) {

        int[] arr = {100000,2000};
        System.out.println(Arrays.toString(getFinalState(arr , 2, 1000000)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int MOD = 1_000_000_007;

        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            nums[minIndex] = (int)((long)nums[minIndex] * multiplier % MOD);
        }

        return nums;
    }
}
