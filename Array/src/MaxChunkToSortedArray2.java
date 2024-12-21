import java.util.Arrays;

public class MaxChunkToSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(maxChunkToSortedArray(arr));
    }

    public static int maxChunkToSortedArray(int[] arr){
        
        int[] prefixSum = Arrays.copyOf(arr , arr.length);
        int[] suffixSum = Arrays.copyOf(arr , arr.length);

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = Math.max(prefixSum[i] , prefixSum[i - 1]);
        }

        for (int i = suffixSum.length - 2; i >= 0 ; i--) {
            suffixSum[i] = Math.min(suffixSum[i] , suffixSum[i + 1]);
        }

        int chunks = 0;
        for (int i = 0; i < arr.length; i++) {
            int prefixMax = i > 0 ? prefixSum[i - 1] : -1;
            int suffixMin = suffixSum[i];

            if(prefixMax <= suffixMin){
                chunks++;
            }
        }

        return chunks;
    }
}
