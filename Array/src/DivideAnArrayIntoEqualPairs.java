import java.util.Arrays;

public class DivideAnArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {2,3, 2, 3, 2, 2,2};
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums){
        int part = nums.length / 2;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                count++;
                i++;
            }
        }

        return count == part;
    }
}
