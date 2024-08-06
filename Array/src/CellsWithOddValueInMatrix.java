public class CellsWithOddValueInMatrix {

    public static void main(String[] args) {

        int[][] index = {
                {0,1},
                {1,1}
        };
        int m = 2;
        int n= 3;
        System.out.println(oddCells(m,n,index));
    }

    public static int oddCells(int m , int n , int[][] index){

        int[][] mat = new int[m][n];

        // Increment the respective rows and columns based on indices
        for (int[] idx : index) {
            int row = idx[0];
            int col = idx[1];

            // Increment the specified row
            for (int j = 0; j < n; j++) {
                mat[row][j]++;
            }

            // Increment the specified column
            for (int i = 0; i < m; i++) {
                mat[i][col]++;
            }
        }

        // Count the number of odd-valued cells
        int counter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
