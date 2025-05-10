public class MinimumEqualSumOfTwoArrayAfterReplacingZeros {
    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 0 , 1 , 0};
        int[] nums2 = {6 ,5 , 0};

        System.out.println(minSum(nums1 , nums2));
    }

    public static long minSum(int[] nums1, int[] nums2){
        int zeroCountNum1 = 0;
        int zeroCountNum2 = 0;

        long num1Sum = 0;
        long num2Sum = 0;

        for (int j : nums1) {
            if (j == 0) {
                zeroCountNum1++;
                num1Sum += 1;
            } else {
                num1Sum += j;
            }
        }

        for (int j : nums2) {
            if (j == 0) {
                zeroCountNum2++;
                num2Sum += 1;
            } else {
                num2Sum += j;
            }
        }

        if(num1Sum < num2Sum && zeroCountNum1 == 0){
            return -1;
        }

        if(num1Sum > num2Sum && zeroCountNum2 == 0){
            return -1;
        }

        return Math.max(num1Sum , num2Sum);
    }
}
