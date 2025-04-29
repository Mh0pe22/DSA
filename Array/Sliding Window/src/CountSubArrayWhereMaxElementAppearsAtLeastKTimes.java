import java.util.Arrays;

public class CountSubArrayWhereMaxElementAppearsAtLeastKTimes {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,3};
        int k = 2;
        System.out.println(countSubArrays(nums , k));
    }

    public static long countSubArrays(int[] nums , int k){

        int n = nums.length;
        int  i = 0;
        int j = 0;
        long ans = 0;
        long count = 0;

        int max = Arrays.stream(nums).max().getAsInt();

        while(j < n){
            if(nums[j] == max){
                count++;
            }

            while (i <= j && count == k){
               ans += n - j;
               if(nums[i] == max){
                  count--;
               }
               i++;
            }
            j++;
        }
        return ans;
    }
}
