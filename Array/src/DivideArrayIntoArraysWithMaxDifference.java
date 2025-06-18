import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] nums = {2,4,2,2,5,2};
        int k = 2;
        int[][] ans = divideArray(nums , k);
        for(int[] i : ans){
            System.out.println(Arrays.toString(i));
        }
    }

    public static int[][] divideArray(int[] nums , int k){
        int[][] ans = new int[nums.length / 3][3];

        int j = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            if(nums[i + 2] - nums[i] > k){
                return new int[][]{};
            }
            ans[j][0] = nums[i];
            ans[j][1] = nums[i + 1];
            ans[j][2] = nums[i + 2];
            j++;
        }

        return ans;
    }
}
