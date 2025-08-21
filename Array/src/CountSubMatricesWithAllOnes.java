public class CountSubMatricesWithAllOnes {
    public static void main(String[] args) {
        int[][] mat = {
                {1 , 1, 1},
                {1 , 0, 1},
                {1 , 1, 1}
        };
        System.out.println(numSubMt(mat));
    }

    public static int numSubMt(int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;

        int totalCount = 0;

        // Fix the starting row
        for (int topRow = 0; topRow < rows; topRow++) {
            // rowMask[col] = 1 if column col has all 1s between topRow..bottomRow
            int[] rowMask = new int[cols];
            for (int i = 0; i < cols; i++) rowMask[i] = 1;

            // Expand bottom row
            for (int bottomRow = topRow; bottomRow < rows; bottomRow++) {
                // Update rowMask using AND
                for (int col = 0; col < cols; col++) {
                    rowMask[col] = rowMask[col] & mat[bottomRow][col];
                }

                // Count submatrices from this row span
                totalCount += countSubarraysOfOnes(rowMask);
            }
        }

        return totalCount;
    }

    public static int countSubarraysOfOnes(int[] rowMask){
        int consecutiveOnes = 0;
        int subArrayCount = 0;

        for(int val : rowMask){
            if(val == 0){
                consecutiveOnes = 0;
            }else{
                consecutiveOnes++;
            }

            subArrayCount += consecutiveOnes;
        }

        return subArrayCount;
    }
}
