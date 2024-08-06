import java.util.Arrays;

public class ReshapeMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4}
        };

        System.out.println(Arrays.deepToString(reshapeMatrix(arr, 1, 4)));
    }

    static int[][] reshapeMatrix(int[][] arr, int r, int c){

        int[] ans = new int[arr.length * arr[0].length];
        int row = arr.length;
        int col = arr[0].length;

        if((row * col) != (r * c)) {
            return arr;
        }

        int i =0;
        for(int[] a : arr){
            for (int b : a){
                ans[i] = b;
                i++;
            }
        }

        i = 0;
        int[][] answer = new int[r][c];
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                answer[j][k] = ans[i];
                i++;
            }
        }

        return answer;
    }
}
