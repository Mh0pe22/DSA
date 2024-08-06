import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose {

    public static void main(String[] args) {

        int[][] arr= {
                {1,2,3},
                {4,5,6},
        };

//        System.out.println(Arrays.toString(transpose(arr)));
        int[][] ans = transpose(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] transpose(int[][] arr){

        if (arr.length == 1){
            return arr;
        }
        int[][] ans = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        return ans;
    }
}
