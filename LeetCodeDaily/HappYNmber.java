import java.util.HashSet;
import java.util.Set;

public class HappYNmber {
    public static void main(String[] args) {

    }

    public static boolean isHappy(int n){

        Set<Integer> visited = new HashSet<>();

        while(n != 1 && !visited.contains(n)){
            visited.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

}
