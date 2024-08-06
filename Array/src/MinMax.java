import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6,7};
        convert(arr);

    }

    static void convert(int[] arr) {
        int mid = arr.length / 2;

        int j = 0;
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i > mid; i--) {
            ans[j] = arr[i];
            j += 2;
        }

        int k = 1;
        for (int i = 0; i < mid; i++) {
            ans[k] = arr[i];
            k += 2;
        }

        if((arr.length & 1) == 1){
            ans[arr.length - 1] = arr[mid];
        }else{
            ans[arr.length - 2] = arr[mid];
        }
        for (int a : ans){
            System.out.println(a + " ");
        }
    }
}
