import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1 , 5 , 11 , 5};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums){
        int n = nums.length;
        int target = Arrays.stream(nums).sum();

        Boolean[][] dp = new Boolean[n][target + 1];

        if(target % 2 != 0){
            return false;
        }

        return solve(n - 1 , target / 2 , nums , dp);
    }

    public static boolean solve(int idx , int target , int[] nums , Boolean[][] dp){

        if(target == 0){
            return true;
        }
        if(idx == 0){
            return (target == nums[idx]);
        }

        if(dp[idx][target] != null){
            return dp[idx][target];
        }

        boolean not_take = solve(idx - 1 , target , nums,  dp);
        boolean take = false;
        if(target >= nums[idx]){
            take = solve(idx - 1 , target - nums[idx] , nums, dp);
        }

        return dp[idx][target] = (take || not_take);
    }
}

