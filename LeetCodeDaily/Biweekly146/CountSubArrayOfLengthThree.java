package Biweekly146;

public class CountSubArrayOfLengthThree {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,1};
        System.out.println(countSubArray(nums));
    }

    public static int countSubArray(int[] nums){

        int count = 0;

        for (int i = 0; i <= nums.length - 3; i++) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];


            if (first + third == second / 2.0) {
                count++;
            }
        }
        return count;
    }
}
