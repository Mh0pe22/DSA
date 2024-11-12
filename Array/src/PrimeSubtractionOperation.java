import java.util.Arrays;

public class PrimeSubtractionOperation {

    public static void main(String[] args) {

    }

    public static boolean[] isPrime = new boolean[1000];

    public static void sieve(){
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < 1000 ; i++) {
            if(isPrime[i]){
                for (int j = i * i; j < 1000 ; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    public static boolean primeSubtraction(int[] nums){

        sieve();

        for (int i = nums.length - 2; i >= 0 ; i--) {
            if(nums[i] < nums[i + 1]){
                continue;
            }

            for (int j = 2; j < nums[i] ; j++) {
                if(!isPrime[j]){
                    continue;
                }

                if(nums[i] - j < nums[i + 1]){
                    nums[i] -= j;
                    break;
                }
            }

            if(nums[i] >= nums[i + 1]){
                return false;
            }
        }

        return true;
    }
}
