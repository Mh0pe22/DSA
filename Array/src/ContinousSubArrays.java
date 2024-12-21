import java.util.Map;
import java.util.TreeMap;

public class ContinousSubArrays {

    public static void main(String[] args) {

    }

    public static long maxSubArray(int[] nums){

        int n = nums.length;

        TreeMap<Integer , Integer> mp = new TreeMap<>();
        int i = 0;
        int j = 0;

        long ans = 0;

        while(j < n) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);

            while (Math.abs(mp.lastKey() - mp.firstKey()) > 2) {
                mp.put(nums[i], mp.get(nums[i]) -  1);
                if (mp.get(nums[i]) == 0) {
                    mp.remove(nums[i]);
                }
                i++;
            }

            ans += j - i + 1;
            j++;
        }

        return ans;
    }
}
