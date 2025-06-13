import java.util.Arrays;

public class MinimizeTheMaximumDifferenceOfPairs {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,1,3};
        int p =2;
        System.out.println(minimizeMax(nums , p));
    }

    public static int minimizeMax(int[] nums , int p){
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = nums[n - 1] - nums[0];

        int ans = Integer.MAX_VALUE;
        while(l <= r){

            int mid = l + (r - l) / 2;
            if(isValid(nums , mid , p)){
                ans = mid ;
                r = mid - 1;
            }else{
                l = mid  + 1;
            }
        }

        return ans;
    }

    public static boolean isValid(int[] nums , int target , int p){
        int i = 0;
        int count = 0;

        while (i < nums.length - 1){
            int diff = nums[i + 1] - nums[i];
            if(diff <= target){
                count++;
                i += 2;
            }else{
                i++;
            }
        }

        return count >=p;
    }
}
