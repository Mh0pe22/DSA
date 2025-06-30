import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums){
        Arrays.sort(nums);

        int i = 0;
        int maxSub = 0;

        for (int j = 0; j < nums.length; j++) {
            while (nums[j] - nums[i] > 1) {
                i++;
            }

            if (nums[j] - nums[i] == 1) {
                maxSub = Math.max(maxSub, j - i + 1);
            }
        }

        return maxSub;
    }
}
