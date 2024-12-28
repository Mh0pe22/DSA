import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumOfThreeNonOverlappingSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,6,7,5,1};
        int k =2;
        System.out.println(Arrays.toString(maxSumOfThreeSubArrays(arr , k)));
    }

    public static int[][] dp = new int[20001][4];
    public static int[] maxSumOfThreeSubArrays(int[] nums , int k){

        for(int[] i : dp){
            Arrays.fill(i , -1);
        }

        int[] subArrays = new int[nums.length];

        int i =0;
        int j =0;
        int windowSum = 0;

        while(j < nums.length){

            windowSum += nums[j];

            if(j - i + 1 == k){
                subArrays[i] = windowSum;
                windowSum -= nums[i];
                i++;
            }
            j++;
        }

        List<Integer> ans = new ArrayList<>();
        solve(subArrays , 0 , k , 3 , ans);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void solve(int[] sums , int index , int k , int count , List<Integer> indices){
        if(count == 0 || index >= sums.length) {
            return;
        }

        int take_index = sums[index] + helper(sums , index + k, k , count - 1);
        int not_take_index = helper(sums , index + 1 , k , count);

        if(take_index >= not_take_index){
            indices.add(index);
            solve(sums , index + k , k , count - 1 , indices);
        }else {
            solve(sums ,index + 1 , k , count , indices);
        }
    }

    public static int helper(int[] sums , int index , int k , int count){
        if(count == 0){
            return 0;
        }

        if(index >= sums.length){
            return Integer.MIN_VALUE;
        }

        if(dp[index][count] != -1){
            return dp[index][count];
        }

        int take = sums[index] + helper(sums , index + k , k , count - 1);
        int not_take = helper(sums , index + 1, k , count);

        return dp[index][count]=Math.max(take , not_take);
    }
}
