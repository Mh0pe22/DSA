import java.util.Arrays;

public class MakeArrayElementsEqualToZero {
    public static void main(String[] args) {
        int[] nums = {16,13,10,0,0,0,10,6,7,8,7};
        System.out.println(countValidSelections(nums));
    }

    public static int countValidSelections(int[] nums) {
        int ans = 0;
        int sum = 0;

        for(int i : nums){
            sum += i;
        }

        int currSum = 0;
        for(int i : nums){
            if(i == 0 && currSum > 0 && currSum == (sum - currSum)){
                ans += 2;
            }else if(i == 0 && (Math.abs(sum - currSum) == currSum + 1 ||  Math.abs(sum - currSum) == currSum - 1) ){
                ans += 1;
            }
            currSum += i;
        }
        return ans;
    }
}
