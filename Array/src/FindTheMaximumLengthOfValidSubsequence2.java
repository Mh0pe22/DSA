public class FindTheMaximumLengthOfValidSubsequence2 {
    public static void main(String[] args) {
        int[] nums = {1 , 4, 2, 3, 4, 1};
        int k = 2;
        System.out.println(maxLength(nums , k));
    }

    public static int maxLength(int[] nums , int k){

        int n = nums.length;
        int[][] dp = new int[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 1;
            }
        }

        int maxSub = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int mod = (nums[i] + nums[j]) % k;

                dp[mod][i] = Math.max(dp[mod][i], 1 + dp[mod][j]);
                maxSub = Math.max(maxSub, dp[mod][i]);
            }
        }

        return maxSub;
    }
}
