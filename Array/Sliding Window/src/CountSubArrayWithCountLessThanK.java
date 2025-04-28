public class CountSubArrayWithCountLessThanK {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,5};
        long k = 10;
        System.out.println(countSubArrays(nums , k));
    }

    public static long countSubArrays(int[] nums , long k){

        int n = nums.length;
        int  i = 0;
        int j = 0;
        long sum = 0;
        long count = 0;

        while (j < n){
            sum += nums[j];

            while (i <= j && sum * (j - i + 1) >= k){
                sum -= nums[i];
                i++;
            }

            count += (j - i + 1);
            j++;
        }

        return count;
    }
}
