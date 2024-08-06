import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {22,11},
                {45,7,38,90},
                {34,67,93}
        };

        int[] ans = Search(arr, 11);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] Search(int [][] arr, int target ){
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int [][] arr){

        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {

            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
