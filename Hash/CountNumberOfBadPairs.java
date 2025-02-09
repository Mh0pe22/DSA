import java.util.HashMap;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        System.out.println(countBadPairs(nums));
    }

    public static long countBadPairs(int[]  nums){
        HashMap<Integer , Integer> mp = new HashMap<>();
        Long result = 0L;

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;
            int totalPairsTillIndex = i;
            int goodPairs = mp.getOrDefault(diff , 0);

            result += totalPairsTillIndex - goodPairs;
            mp.put(diff , goodPairs + 1);
        }

        return result;
    }
}
