import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosetPrimeNumberInRange {
    public static void main(String[] args) {
        int left = 10;
        int right = 19;
        System.out.println(Arrays.toString(closestPrimeNumberInRange(left , right)));
    }

    public static int[] closestPrimeNumberInRange(int left , int right){
        List<Integer> prime = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if(isPrime(i)){
                if(!prime.isEmpty() && i - prime.getLast() <= 2){
                    return new int[]{prime.getLast() , i};
                }
                prime.add(i);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        int[] ans = {-1 , -1};
        for (int i = 1; i < prime.size(); i++) {
            int diff = prime.get(i) - prime.get(i - 1);
            if(diff < minDiff){
                minDiff = diff;
                ans[0] = prime.get(i - 1);
                ans[1] = prime.get(i);
            }
        }

        return ans;
    }

    public static boolean isPrime(int number){

        if(number == 1){
            return false;
        }

        for (int div = 2; div * div <= number ; div++) {
            if(number % div == 0){
                return false;
            }
        }

        return true;
    }
}
