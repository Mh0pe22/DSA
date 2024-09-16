import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReachEndOfArrayWithMaxScore {
    public static void main(String[] args) {

        Integer[] arr = {4,3,1,3,2};
        List<Integer> li = new ArrayList<>(Arrays.asList(arr));

        System.out.println(findMaximumScore(li));
    }

    public static long findMaximumScore(List<Integer> nums) {
        long sum = 0;
        int k = 0;

        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(k) < nums.get(i)){
                sum += (long) (i - k) * nums.get(k);
                k = i;
            }
            if(i == nums.size() - 1){
                sum += (long)(i - k) * nums.get(k);
            }
        }

        return sum;
    }
}
