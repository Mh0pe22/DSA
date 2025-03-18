public class LongestNiceSubArray {
    public static void main(String[] args) {
        int[] nums = {1 ,3 , 8 , 48 , 10};
        System.out.println(longestNiceSubArray(nums));
    }

    public static int longestNiceSubArray(int[] nums){

        int n =  nums.length;
        int i = 0;
        int j = 0;

        int mask = 0;
        int result = 1;

        while(j < n){
            while((mask & nums[j]) != 0){
                mask ^= nums[i];
                i++;
            }

            result = Math.max(result , j - i + 1);
            mask |= nums[j];
            j++;
        }
        return result;
    }
}
