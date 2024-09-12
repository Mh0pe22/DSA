import java.util.Arrays;

public class FindPeakGrid {

    public static void main(String[] args) {

        int[][] arr = {
                {10,13,17},
                {11,12,18},
                {7,16,32}
        };

        System.out.println(Arrays.toString(peakGrid(arr)));
    }

    public static int[] peakGrid(int[][] arr){

//        int rowS = 0;
//        int rowE = arr.length - 1;
//        int colS = 0;
//        int colE = arr[0].length - 1;
//
//        while (rowS <= rowE && colS <= colE) {
//            int midR = rowS + (rowE - rowS) / 2;
//            int midC = colS + (colE - colS) / 2;
//
//            int midVal = arr[midR][midC];
//
//            int left = (midC - 1 >= 0) ? arr[midR][midC - 1] : Integer.MIN_VALUE;
//            int right = (midC + 1 < arr[0].length) ? arr[midR][midC + 1] : Integer.MIN_VALUE;
//            int top = (midR - 1 >= 0) ? arr[midR - 1][midC] : Integer.MIN_VALUE;
//            int bottom = (midR + 1 < arr.length) ? arr[midR + 1][midC] : Integer.MIN_VALUE;
//
//            if (midVal >= left && midVal >= right && midVal >= top && midVal >= bottom) {
//                return new int[]{midR, midC};
//            }
//
//            if (left > midVal) {
//                colE = midC - 1;
//            } else if (right > midVal) {
//                colS = midC + 1;
//            } else if (top > midVal) {
//                rowE = midR - 1;
//            } else if (bottom > midVal) {
//                rowS = midR + 1;
//            }
//        }

        int rowS = 0;
        int rowE = arr.length - 1;

        while (rowS <= rowE) {
            int midR = rowS + (rowE - rowS) / 2;
            int maxCol = 0;


            for (int col = 0; col < arr[0].length; col++) {
                if (arr[midR][col] > arr[midR][maxCol]) {
                    maxCol = col;
                }
            }

            boolean isPeak = true;
            if (midR - 1 >= 0 && arr[midR - 1][maxCol] > arr[midR][maxCol]) {
                rowE = midR - 1;
                isPeak = false;
            } else if (midR + 1 < arr.length && arr[midR + 1][maxCol] > arr[midR][maxCol]) {
                rowS = midR + 1;
                isPeak = false;
            }

            if (isPeak) {
                return new int[]{midR, maxCol};
            }
        }

        return new int[]{-1,-1};
    }
}
