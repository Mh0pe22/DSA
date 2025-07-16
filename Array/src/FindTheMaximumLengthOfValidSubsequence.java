public class FindTheMaximumLengthOfValidSubsequence {
    public static void main(String[] args) {
        int[] nums = {1 , 2, 1, 1, 1,2, 1};
        System.out.println(maximumLength(nums));
    }

    public static int maximumLength(int[] nums){
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        int parity = nums[0] % 2 ;
        int alternateCount = 1;

        for (int i = 1; i < nums.length; i++) {
            int currParity = nums[i] % 2;

            if(parity != currParity){
                parity = currParity;
                alternateCount++;
            }
        }

        return Math.max((Math.max(oddCount , evenCount)), alternateCount);
    }
}
