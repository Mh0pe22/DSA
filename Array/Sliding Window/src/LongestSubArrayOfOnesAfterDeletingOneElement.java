public class LongestSubArrayOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {1 , 1, 1, 0, 1};
        System.out.println(longestSubArray(nums));
    }

    public static int longestSubArray(int[] nums){
        int i = 0;
        int j = 0;

        int last_zero_idx = -1;
        int result = 0;

        while(j < nums.length){
            if (nums[j] == 0){
                i = last_zero_idx + 1;
                last_zero_idx = j;
            }
            result = Math.max(result , j - i);
            j++;
        }

        return result;
    }
}
