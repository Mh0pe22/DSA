import java.util.HashMap;

public class CountGoodPairs {
    public static void main(String[] args) {
        int[] nums = {42 ,11 , 1, 97};
        System.out.println(countNicePairs(nums));
    }

    public static int countNicePairs(int[] nums){
        HashMap<Integer , Integer> mp = new HashMap<>();
        int mod = 1_000_000_007;
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            StringBuilder s = new StringBuilder(Integer.toString(nums[i]));
            int reversed = Integer.parseInt(s.reverse().toString());
            int diff = nums[i] - reversed;

            result = (result + mp.getOrDefault(diff, 0)) % mod;

            mp.put(diff, mp.getOrDefault(diff, 0) + 1);
        }

        return (int)result;
    }
}
