import java.util.Arrays;

public class DuplicateArray {

    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println((removeDuplicates2(arr)));
    }

    static public int[] removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        int first = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                nums[i] = 0; // Mark duplicate as zero
            }
        }

        int[] ans = new int[nums.length - count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if(first == nums[0] && i == 0){
                ans[j] = first;
                j++;
            }
           else if (nums[i] != 0) {
                ans[j] = nums[i];
                j++;
            }
        }

        return ans;
    }

    static public int removeDuplicates2(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
            int k = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }

}
