import java.lang.reflect.Array;
import java.util.Arrays;

public class Shuffle {

    public static void main(String[] args) {

        int[] arr= {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));
    }

    static int[] shuffle(int[] arr){
        int i = 0;
        int j = 1;
        int mid = i + (arr.length - 1 - i) / 2;
        int[] ans = new int[arr.length];


        for (int k = 0; k <= mid; k ++) {
            ans[i] = arr[k];
            ans[j] = arr[mid + k + 1];
            i += 2;
            j += 2;
        }

        arr = ans;
        return arr;
    }
}
