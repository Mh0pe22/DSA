import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {1 , 3 , 5 , 8 , 9 , 18};
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        int[] t = new int[n];
        Arrays.fill(t , 1);

        int[] prevIdx = new int[n];
        Arrays.fill(prevIdx , -1);

        int prevChosenIdx = 0;
        int maxL = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0){
                    if(t[i] < t[j] + 1){
                        t[i] = t[j] + 1;
                        prevIdx[i] = j;
                    }
                }

                if(t[i] > maxL){
                    maxL = t[i];
                    prevChosenIdx = i;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (prevChosenIdx >= 0){
            ans.add(nums[prevChosenIdx]);
            prevChosenIdx = prevIdx[prevChosenIdx];
        }

        return ans;
    }
}
