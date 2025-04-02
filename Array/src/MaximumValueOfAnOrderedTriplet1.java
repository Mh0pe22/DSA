public class MaximumValueOfAnOrderedTriplet1 {
    public static void main(String[] args) {
        int[] nums = {12 , 6 ,1 ,2 ,7};
        System.out.println(maximumTripletValue(nums));
    }

    public static long maximumTripletValue(int[] nums){
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n ; j++) {
               long sub = nums[i] - nums[j];
                for (int k = j + 1; k < n ; k++) {
                    long mul = sub * nums[k];
                     ans = Math.max(ans , mul);
                }
            }
        }
        return ans;
    }
}
