public class NumberOfWaysToSplit {
    public static void main(String[] args) {
        int[] arr = {10 , 4 , -8 , 7};
        System.out.println(waysToSplitArray(arr));
    }

    public static int waysToSplitArray(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int count = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = sum - leftSum;
            if(leftSum >= rightSum){
                count++;
            }
        }

        return count;
    }
}
