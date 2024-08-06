import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {

        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 49}
        };
        System.out.println(Arrays.toString(search(mat, 20)));
    }

    static int[] search(int [][] mat, int target){

        int row = 0;
        int col = mat.length - 1;

        while(row < mat.length && col >=0){
            if(target == mat[row][col]){
                return new int[]{row,col};
            } else if (target < mat[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
