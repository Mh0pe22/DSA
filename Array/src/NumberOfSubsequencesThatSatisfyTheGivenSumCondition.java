import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public static void main(String[] args) {
        int[] nums = {2,3,3,4,6,7};
        int target = 12;
        System.out.println(numSubseq(nums , target));
    }

    private final static int MOD = 1_000_000_007;
    public static int numSubseq(int[] nums , int target){
        int n = nums.length;
        int result = 0;

        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        Arrays.sort(nums);
        int l = 0;
        int r = n - 1;
        while(l <= r){
            if(nums[l] + nums[r] <= target){
                int diff = r - l;
                result = ((result % MOD) + power[diff]) % MOD;
                l++;
            }else{
                r--;
            }
        }

        return result;
    }
}
