import java.util.Arrays;

public class HouseRobber4 {
    public static void main(String[] args) {
        int[] nums = {2 , 3, 5 , 9};
        int k = 2;
        System.out.println(minCapability(nums , k));
    }

    public static int minCapability(int[] nums , int k){
        int n = nums.length;
        int l = Arrays.stream(nums).min().orElseThrow();
        int r = Arrays.stream(nums).max().orElseThrow();

        int ans = r;
        while(l <=  r){
            int mid = l + (r - l) / 2;

            if(isPossible(nums , mid , k)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid  + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] nums , int mid , int k){

        int house = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= mid){
                house++;
                i++;
            }
        }

        return house >= k;
    }
}
