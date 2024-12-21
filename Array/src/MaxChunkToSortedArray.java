public class MaxChunkToSortedArray {
    public static void main(String[] args) {

    }

    public static int maxChunksToSorted(int[] arr){

        int originalArrSum = 0;
        int sortedArrSum = 0;
        int chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            originalArrSum += arr[i];
            sortedArrSum += i;

            if(originalArrSum == sortedArrSum) {
                chunks++;
            }
        }

        return chunks;
    }
}
