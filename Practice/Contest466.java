import java.util.HashMap;
import java.util.HashSet;

public class Contest466 {
    public static void main(String[] args) {
        int[] nums = {109,14,19,32,89};
//        System.out.println(minOperations(nums));
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans &= nums[i];
        }
        System.out.println(ans);
    }

    public static int minOperations(int[] nums) {

        boolean isAllSame = true;
        int prev = nums[0];

        for(int n : nums){
            if(n != prev){
                isAllSame = false;
                break;
            }
        }

        if(isAllSame){
            return 0;
        }

        return 1;
    }

    public static int minOperations(String s) {
        String trinovalex = s;

        int maxSteps = 0;
        for (char ch : trinovalex.toCharArray()) {
            int steps = (('a' - ch) + 26) % 26;
            maxSteps = Math.max(maxSteps, steps);
        }
        return maxSteps;
    }

    public long bowlSubArrays(int[] nums) {
        return 0;
    }
}
