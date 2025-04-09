import java.util.HashSet;
import java.util.Set;

public class MinimumOperationToMakeArrayValuesEqualToK {
    public static void main(String[] args) {
        int[] nums = {5,2,5,4,5};
        int k =  2;
        System.out.println(minOperations(nums , k));
    }

    public static int minOperations(int[] nums , int k){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(num < k){
                return -1;
            } else if(num > k){
                set.add(num);
            }
        }

        return set.size();
    }
}
