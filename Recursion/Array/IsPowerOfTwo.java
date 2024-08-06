package Array;

public class IsPowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    static boolean isPowerOfTwo(int n ) {

        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }

        return false;
    }

    static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 3 == 0) {
            return isPowerOfThree(n / 3);
        }

        return false;
    }
}
