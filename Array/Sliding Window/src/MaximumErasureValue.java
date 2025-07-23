import java.io.Serializable;
import java.util.HashMap;
import java.util.function.Function;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(MaximumUniqueSubArray(nums));
    }

    public static int MaximumUniqueSubArray(int[] nums){
        HashMap<Integer , Integer> mp = new HashMap<>();
        int i = 0;
        int j = 1;

        int ans = Integer.MIN_VALUE;
        int sum = nums[0];
        mp.put(nums[0] , 1);
        while(i < j && j < nums.length){
            while(mp.containsKey(nums[j])){
                ans = Math.max(ans, sum);
                sum -= nums[i];
                mp.remove(nums[i]);
                i++;
            }
            sum += nums[j];
            mp.put(nums[j] , 1);
            j++;
        }

        return Math.max(ans , sum);
    }

    public void interfaces(){
        Function<String , String > function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "Hello " + s;
            }
        };
        
    }
}
