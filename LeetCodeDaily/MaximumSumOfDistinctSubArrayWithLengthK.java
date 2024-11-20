import java.util.HashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubArrayWithLengthK {
    public static void main(String[] args) {

        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubArraySum(arr , k));
    }

    public static long maximumSubArraySum(int[] nums , int k){

        Set<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        long sum = 0;
        long currSum = 0;

        while(j < nums.length){

            while(set.contains(nums[j])){

                currSum -= nums[i];
                set.remove(nums[i]);

                i++;
            }

            currSum += nums[j];
            set.add(nums[j]);

            if(j - i + 1 == k){
                sum = Math.max(sum , currSum);

                currSum -= nums[i];
                set.remove(nums[i]);

                i++;
            }

            j++;

        }

        return sum;
    }
}
