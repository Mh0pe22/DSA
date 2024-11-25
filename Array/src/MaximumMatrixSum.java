public class MaximumMatrixSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {-1,-2,-3},
                {1,2,3}
        };

        System.out.println(maxMatrixSum(mat));
    }

    public static long maxMatrixSum(int[][] matrix){
        long sum = 0;
        int negativeCount = 0;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                sum += Math.abs(matrix[i][j]);

                if(matrix[i][j] < 0){
                    negativeCount++;
                }

                minVal = Math.min(minVal , Math.abs(matrix[i][j]));
            }
        }

        if(negativeCount % 2 == 0){
            return sum;
        }

        return sum - (2L * minVal);
    }
}
