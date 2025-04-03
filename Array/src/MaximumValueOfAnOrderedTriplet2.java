public class MaximumValueOfAnOrderedTriplet2 {
    public static void main(String[] args) {
        int[] nums = {12 , 6 ,1 ,2 ,7};
        System.out.println(maximumTripletValue(nums));
    }

    public static long maximumTripletValue(int[] nums){

        long result = 0;
        long maxi = 0;
        long maxDiff = 0;

        for (int i = 0; i < nums.length; i++) {

            result = Math.max(result , maxDiff * nums[i]);
            maxDiff = Math.max(maxDiff , maxi - nums[i]);
            maxi = Math.max(maxi , nums[i]);
        }

        return result;
    }
}
