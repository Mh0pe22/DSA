import java.util.Arrays;

public class ApplyOperationToAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperation(nums)));
    }

    public static int[] applyOperation(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int[] ans = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                ans[j] = num;
                j++;
            }
        }

        return ans;
    }
}
