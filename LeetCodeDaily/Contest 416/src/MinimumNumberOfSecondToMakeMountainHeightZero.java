public class MinimumNumberOfSecondToMakeMountainHeightZero {
    public static void main(String[] args) {

    }

    public static  long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        // Binary search to find the minimum time
        long left = 0;
        long right = Long.MAX_VALUE; // a sufficiently large upper bound

        while (left < right) {
            long mid = (left + right) / 2;

            if (canReduceInTime(mid, mountainHeight, workerTimes)) {
                right = mid; // try for a smaller time
            } else {
                left = mid + 1; // need more time
            }
        }

        return left; // the minimum time found
    }

    private static boolean canReduceInTime(long timeLimit, int mountainHeight, int[] workerTimes) {
        long totalHeightReduced = 0;

        for (int workerTime : workerTimes) {
            long left = 0;
            long right = mountainHeight;

            // Binary search to find the maximum height this worker can reduce in `timeLimit`
            while (left < right) {
                long mid = (left + right + 1) / 2; // upper mid
                // Calculate time taken to reduce height by `mid`
                long timeTaken = (long) workerTime * mid * (mid + 1) / 2; // using long to prevent overflow

                if (timeTaken <= timeLimit) {
                    left = mid; // can reduce at least `mid`
                } else {
                    right = mid - 1; // cannot reduce `mid`
                }
            }

            totalHeightReduced += left; // add the maximum height this worker can reduce
            if (totalHeightReduced >= mountainHeight) {
                return true; // enough height reduced
            }
        }

        return totalHeightReduced >= mountainHeight; // final check
    }

}
