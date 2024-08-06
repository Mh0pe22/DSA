import java.util.Arrays;

public class MaxPossibleScore {
    public static void main(String[] args) {
        int[] arr = {1000000000,0};
        int d = 1000000000;
        System.out.println(maxPossibleScore(arr , d));
    }

    public static int maxPossibleScore(int[] start , int d){
        Arrays.sort(start);
        int n = start.length;

        // Binary search for the maximum possible minimum difference
        int low = 0, high = (start[n - 1] + d) - start[0], result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if we can pick numbers with at least `mid` difference
            if (canChooseWithMinDiff(start, d, mid)) {
                result = mid;  // This is a valid candidate, so we try for a larger min diff
                low = mid + 1;  // Search in the higher half
            } else {
                high = mid - 1;  // Search in the lower half
            }
        }

        return result;
    }

    private static boolean canChooseWithMinDiff(int[] start, int d, int minDiff) {
        int n = start.length;
        int prev = start[0];  // We start by selecting the first interval's lower bound

        for (int i = 1; i < n; i++) {
            // We need to choose a number in the ith interval [start[i], start[i] + d]
            // that is at least `prev + minDiff`.
            int next = prev + minDiff;

            // If `next` is greater than the upper bound of the interval, we fail.
            if (next > start[i] + d) {
                return false;  // Can't place a valid number in this interval
            }

            // Otherwise, we pick the max possible number `next` (i.e., prev + minDiff)
            prev = Math.max(next, start[i]);
        }

        return true;
    }
}
