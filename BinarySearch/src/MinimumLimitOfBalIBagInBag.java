import java.util.Arrays;
import java.util.OptionalInt;

public class MinimumLimitOfBalIBagInBag {
    public static void main(String[] args) {

        int[] nums = {9};
        int maxOps = 2;
        System.out.println(minimumSize(nums , maxOps));
    }

    public static int minimumSize(int[] nums , int maxOperation){

        OptionalInt max = Arrays.stream(nums).max();

        int l = 1;
        int r = max.orElse(0);
        int ans = r;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(isPossible(nums , mid , maxOperation)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] arr , int mid , int maxOps){

        int count = 0;
        for(int i : arr){
            int ops = i / mid;

            if(i % mid == 0){
                ops -= 1;
            }

            count += ops;
        }

        return count <= maxOps;
    }
}
