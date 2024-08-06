import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {

    public static void main(String[] args) {
            int[][] arr ={
                    {3,7,8},
                    {9,11,13},
                    {15,16,17}
            };

        System.out.println(lucky(arr));
    }

    static List<Integer> lucky(int[][] arr){
        List<Integer> list = new ArrayList<>();
        for (int[] ints : arr) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
            for (int j = 0; j < ints.length; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k][j] > max) {
                        max = arr[k][j];
                    }
                }
                if (min == max) {
                    list.add(min);
                }
            }
        }
        return list;
    }

}
