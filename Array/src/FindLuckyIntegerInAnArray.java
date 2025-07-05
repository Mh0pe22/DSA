import java.util.HashMap;
import java.util.Map;
public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        System.out.println(findLucky(nums));
    }

    public static int findLucky(int[] nums){
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i : nums){
            mp.put(i , mp.getOrDefault(i , 0) + 1);
        }

        int ans = -1;
        for(int i : mp.keySet()){
            if(i == mp.get(i)){
                ans = Math.max(i , ans);
            }
        }

        return ans;
    }
}
