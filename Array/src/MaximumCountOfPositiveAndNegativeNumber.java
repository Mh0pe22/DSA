public class MaximumCountOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        int[] nums = {-2 , -2 , -1 , 0 , 0 , 1, 2, 3};
        System.out.println(maximumCount(nums));
    }

    public static int maximumCount(int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] != 0){
                count = Math.max(count , nums.length - i);
                break;
            }
            if(nums[i] != 0){
                count++;
            }
        }
        return count;
    }
}
