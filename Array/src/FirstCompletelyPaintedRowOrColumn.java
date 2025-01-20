import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRowOrColumn {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[][] mat = {
                {1,4},
                {2,3}
        };

        System.out.println(firstCompleteIndex(arr , mat));
    }

    public static int firstCompleteIndex(int[] arr , int[][] mat){

        int m = mat.length;
        int n = mat[0].length;

        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] , i);
        }

        int minIndex = Integer.MAX_VALUE;
        // row
        for (int i = 0; i < m; i++) {

            int lastIndex = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int index = map.get(mat[i][j]);
                lastIndex = Math.max(lastIndex , index);
            }

            minIndex = Math.min(lastIndex , minIndex);
        }

        // col
        for (int i = 0; i < n; i++) {

            int lastIndex = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                int index = map.get(mat[j][i]);
                lastIndex = Math.max(lastIndex , index);
            }

            minIndex = Math.min(lastIndex , minIndex);
        }

        return minIndex;
    }
}
