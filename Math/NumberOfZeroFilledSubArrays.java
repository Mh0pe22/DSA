public class NumberOfZeroFilledSubArrays {
    public static void main(String[] args) {
        int[] nums ={0 , 0 , 0 , 2, 0 , 0};
        System.out.println(zeroFilledSubArrays(nums));
    }

    public static long zeroFilledSubArrays(int[] nums){
        long ans = 0;
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count > 0 && nums[i] != 0){
                long sum = (count * (count + 1) )/ 2;
                ans += sum;
                count = 0;
            }

            if(nums[i] == 0)
                count++;
        }

        if(count > 0){
            long sum = ((long) count * (count + 1)) / 2;
            ans += sum;
        }
        return ans;
    }
}
