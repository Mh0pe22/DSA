import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleArray {

    public static void main(String[] args) {

        int[] arr= {1,2,1};
        System.out.println(Arrays.toString(doubleArray(arr)));
    }

    public static int[] doubleArray(int[] arr){

        int[] ans = new int[2 * arr.length];
        int mid = arr.length ;
        for (int i = 0; i < mid; i++) {
            ans[i] = arr[i];
            ans[mid + i] = arr[i];
        }

        arr = ans;
        return arr;
    }
}
