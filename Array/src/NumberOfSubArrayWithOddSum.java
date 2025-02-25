public class NumberOfSubArrayWithOddSum {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,7,9,4};
        System.out.println(numOfSubArrays(arr));
    }

    public static int numOfSubArrays(int[] arr){
        int MOD = 1_000_000_007;
        int n = arr.length;

        int count = 0;
        int odd = 0;
        int even = 1;
        int cumSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumSum += arr[i];

            if(cumSum % 2 == 0){
                // odd + even = odd
                count = (count + odd) % MOD;
                even++;
            }else{
                // even + odd = odd
                count = (count + even) % MOD;
                odd++;
            }
        }

        return count;

    }
}
