import java.util.Arrays;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }

    public static int[] arr = new int[10001]; // Memoization array

    public static int numSquares(int n) {
        Arrays.fill(arr, -1);
        return helper(n);
    }

    public static int helper(int n) {
        if (n == 0) {
            return 0;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int result = 1 + helper(n - i * i);
            minCount = Math.min(result, minCount);
        }

        arr[n] = minCount;
        return arr[n];
    }
}
