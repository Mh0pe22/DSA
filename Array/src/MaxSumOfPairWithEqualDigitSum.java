public class MaxSumOfPairWithEqualDigitSum {
    public static void main(String[] args) {
        int[] nums = {18,43,36,13,7};
        System.out.println(maximumSum(nums));
    }

    public static int maximumSum(int[] nums){
        int sum  = -1;
        int[] digitSum = new int[82];

        for (int num : nums) {

            int sumOfDigit = dSum(num);
            if (digitSum[sumOfDigit] > 0) {
                sum = Math.max(sum, num + digitSum[sumOfDigit]);
            }

            digitSum[sumOfDigit] = Math.max(digitSum[sumOfDigit], num);
        }

        return sum;
    }

    public static int dSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
