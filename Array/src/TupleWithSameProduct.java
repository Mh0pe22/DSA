import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public static void main(String[] args) {

    }

    public static int product(int[] nums){
        int tuples = 0;
        Map<Integer , Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int p = nums[i] * nums[j];
            }
        }
    }
}
