public class LongestStrictlyIncreasingOrDecreasingSubArray {
    public static void main(String[] args) {
        int[] nums = {3};
        System.out.println(longestMonotonicSubArray(nums));
    }

    public static int longestMonotonicSubArray(int[] nums){

        int inc = 0;
        int dec = 0;

        int currCount = 0;
        boolean isIncreasing = false;
        for (int i = 0; i < nums.length - 1; i++) {
            isIncreasing = nums[i] > nums[i + 1];

            if(nums[i] == nums[i + 1]){
                inc = 0;
                dec = 0;
            }else {
                if (isIncreasing) {
                    inc++;
                    currCount = Math.max(currCount, inc);
                    dec = 0;
                } else {
                    dec++;
                    currCount = Math.max(currCount, dec);
                    inc = 0;
                }
            }
        }

        return currCount + 1;
    }
}
