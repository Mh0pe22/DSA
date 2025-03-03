import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums , pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot){

        /*
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        int pivotCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot){
                leftArray.add(nums[i]);
            } else if (nums[i] > pivot) {
                rightArray.add(nums[i]);
            }else{
                pivotCount++;
            }
        }

        int i =0;
        for (int j = 0; j < leftArray.size(); j++) {
            nums[i] = leftArray.get(j);
            i++;
        }
        while(pivotCount > 0){
            nums[i] = pivot;
            pivotCount--;
            i++;
        }

        for (int j = 0; j < rightArray.size(); j++) {
            nums[i] = rightArray.get(j);
            i++;
        }

        return nums;
        */

        int leftCount = 0;
        int pivotCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot){
                leftCount++;
            } else if (nums[i] == pivot) {
                pivotCount++;
            }
        }

        int i = 0;
        int j = leftCount;
        int k = leftCount + pivotCount;

        int[] ans = new int[nums.length];
        for (int l = 0; l < nums.length; l++) {
            if(nums[l] < pivot){
                ans[i] = nums[l];
                i++;
            } else if (nums[l] == pivot) {
                ans[j] = nums[l];
                j++;
            }else{
                ans[k] = nums[l];
                k++;
            }
        }
        return ans;
    }
}
