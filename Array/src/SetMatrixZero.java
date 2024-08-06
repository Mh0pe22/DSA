import java.util.Arrays;

public class SetMatrixZero {

    public static void main(String[] args) {

        int[][] mat = {
                {0,1,2,0},
                {1,1,1,1},
                {1,1,1,1}
        };

        setZeroes(mat);
    }

    static void setZeroes(int[][] mat){

        int[][] ans = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i] , 0 , ans[i] , 0 , mat[0].length);
        }

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0 && ans[i][j] == 0){
                    for (int row = 0; row < mat.length; row++){
                        ans[row][j] = 0;
                    }

                    for (int col = 0; col < mat[0].length; col++) {
                        ans[i][col] = 0;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}
