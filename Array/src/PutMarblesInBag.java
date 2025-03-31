import java.util.Arrays;

public class PutMarblesInBag {
    public static void main(String[] args) {
        int[] weights = {1 , 3 ,5 ,2};
        int k = 2;
        System.out.println(putMarbles(weights , k));
    }

    public static long putMarbles(int[] weights , int k){
        int n = weights.length;

        int[] pairSum = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pairSum[i] = weights[i] + weights[i + 1];
        }

        long minSum = 0;
        long maxSum = 0;
        Arrays.sort(pairSum);
        int m = n - 1;
        for (int i = 0; i < k - 1; i++) {
            minSum += pairSum[i];
            maxSum += pairSum[m - i - 1];
        }

        return maxSum - minSum;
    }
}
