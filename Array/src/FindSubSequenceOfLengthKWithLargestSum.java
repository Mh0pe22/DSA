import java.util.Arrays;

public class FindSubSequenceOfLengthKWithLargestSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,3,4};
        int k = 3;

        System.out.println(Arrays.toString(maxSubsequence(nums , k)));
    }

    public static int[] maxSubsequence(int[] nums , int k){
        if(k == nums.length){
            return nums;
        }
        int[] temp = Arrays.copyOf(nums , nums.length);

        Arrays.sort(temp);
        int threshold = temp[temp.length - k];

        int thresholdCount = 0;
        for (int i = temp.length - k; i < temp.length ; i++) {
            if(temp[i] == threshold){
                thresholdCount++;
            }
        }

        int[] result = new int[k];
        int index = 0;
        for(int num : nums){
            if(num > threshold){
                result[index++] = num;
            } else if (num == threshold && thresholdCount > 0) {
                result[index++] = num;
                thresholdCount--;
            }

            if(index == k){
                break;
            }
        }

        return result;

    }
}
