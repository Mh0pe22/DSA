import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexOfAValidSplit {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1 , 2 , 2, 2));
        System.out.println(minimumIndex(nums));
    }

    public static int minimumIndex(List<Integer> nums){

        int major = -1;
        int count = 0;

        for(int i : nums){
            if(count == 0){
                major = i;
                count++;
            } else if (i == major) {
                count++;
            }else{
                count--;
            }
        }

        int majorityCount = 0;
        for(int i : nums){
            if(i == major){
                majorityCount++;
            }
        }

        count = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);

            if(nums.get(i) == major){
                count++;
            }

            int remainingCount = majorityCount - count;
            int n1 = i + 1;
            int n2 = nums.size() - i - 1;

            if(count * 2 > n1 && remainingCount * 2 > n2){
                return i;
            }
        }

        return -1;
    }
}
