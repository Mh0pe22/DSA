import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public static void main(String[] args) {
        int[] nums = {2 , 3, 4, 6};
        System.out.println(product(nums));
    }

    public static int product(int[] nums){
        int tuples = 0;
        Map<Integer , Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int p = nums[i] * nums[j];
                mp.put(p , mp.getOrDefault(p , 0) + 1);
            }
        }

        for(int freq : mp.values()){
            tuples += (freq * (freq - 1)) / 2;
        }

        return tuples * 8;
    }
}
