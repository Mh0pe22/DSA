public class ArrangingCoins {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n){
        if (n <= 1) {
            return n;  // If n is 1 or less, the largest k is n itself.
        }

        long s = 1;
        long e = n;
        int result = 0;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            long sum = (mid * (mid + 1)) / 2;  // Sum of first mid natural numbers.

            if (sum == n) {
                return (int)mid;  // If the sum is exactly n, return mid.
            }

            if (sum < n) {
                result =(int) mid;  // Update result to the current mid.
                s = mid + 1;  // Try for a larger mid.
            } else {
                e = mid - 1;  // Try for a smaller mid.
            }
        }

        return result;  // Return the largest k found.
    }
}
