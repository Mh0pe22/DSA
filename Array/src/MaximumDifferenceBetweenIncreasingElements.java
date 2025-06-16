public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums = {2 , 3, 10 , 9};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums){

        int diff = -1;
        int minEle = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > minEle){
                diff = Math.max(diff , nums[i] - minEle);
            }else{
                minEle = nums[i];
            }
        }

        return diff;
    }
}
