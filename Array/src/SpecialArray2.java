import java.util.Arrays;

public class SpecialArray2 {
    public static void main(String[] args) {

        int[] arr = {3,4,1,2,6};
        int[][] queries = {{0,4}};

        System.out.println(Arrays.toString(isArraySpecial(arr , queries)));
    }

    public static boolean[] isArraySpecial(int[] nums , int[][] queries) {
        int[] cumSum = new int[nums.length];
        boolean[] ans = new boolean[queries.length];

        cumSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                cumSum[i] = cumSum[i - 1] + 1;
            } else {
                cumSum[i] = cumSum[i - 1];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i] = cumSum[start] - cumSum[end] == 0;
        }

        return ans;
    }
}
