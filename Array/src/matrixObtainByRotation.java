public class matrixObtainByRotation {


    public static void main(String[] args) {
        int[][] arr ={
                {0,0},
                {1,1}
        };

        int[][] target = {
                {0,1},
                {1,0}
        };

        System.out.println(findRotation(arr,target));
    }


    public static boolean findRotation(int[][] mat, int[][] target) {

        // Check for 0 degree (original), 90 degrees, 180 degrees, and 270 degrees
        if (matricesEqual(mat, target)) return true;
        int[][] rotated90 = rotate90(mat);
        if (matricesEqual(rotated90, target)) return true;
        int[][] rotated180 = rotate90(rotated90);
        if (matricesEqual(rotated180, target)) return true;
        int[][] rotated270 = rotate90(rotated180);
        if (matricesEqual(rotated270, target)) return true;

        return false;
    }

    public static int[][] rotate90(int[][] matrix) {

        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

   public static  boolean matricesEqual(int[][] m1, int[][] m2) {

        int n =m1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
