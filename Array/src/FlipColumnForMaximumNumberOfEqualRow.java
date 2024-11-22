import java.util.Arrays;

public class FlipColumnForMaximumNumberOfEqualRow {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1},
                {1,1}
        };
        System.out.println(maxEqualRowsAfterFlips(mat));
    }

    public static int maxEqualRowsAfterFlips(int[][] matrix){
        int maximumCount = 0;

        for (int[] i : matrix) {
            int[] inverted = new int[matrix[0].length];

            for (int col = 0; col < matrix[0].length; col++) {
                inverted[col] = i[col] == 0 ? 1 : 0;
            }

            int count = 0;

            for(int[] j : matrix){
                if(Arrays.equals(j , i) || Arrays.equals(j , inverted)){
                    count++;
                }
            }

            maximumCount = Math.max(maximumCount , count);
        }

        return maximumCount;
    }
}
