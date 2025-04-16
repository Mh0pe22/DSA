import java.sql.PreparedStatement;
import java.util.HashMap;

public class CountTheNumberOfGoodSubArrays {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2,2,4};
        int k = 2;
        System.out.println(countGoods(nums , k));
    }
    public static long countGoods(int[] nums , int k){
        int n =  nums.length;

        int i = 0;
        int j = 0;
        long pairs = 0;

        long ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        while(j < n){
            pairs += map.getOrDefault(nums[j] , 0);
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) + 1);

            while (pairs >= k){
                ans += (n - j);
                map.put(nums[i] , map.get(nums[i]) - 1);
                pairs -= map.get(nums[i]);
                i++;
            }

            j++;
        }

        return ans;
    }
}
