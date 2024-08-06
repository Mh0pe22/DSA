import java.lang.reflect.Array;
import java.util.Arrays;

public class SortIndex {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,2,8};
        System.out.println(sortIndexFirst(arr));
        System.out.println(sortIndexLast(arr));
    }

    static int sortIndexFirst(int[] arr){

        int[] a = arr.clone();
        Arrays.sort(a);


        int count=0;

        for (int k = 0; k < arr.length; k++) {
            if(a[k] != arr[k]){
                return k;
            }
        }
        return -1;
    }

    static int sortIndexLast(int[] arr){

        int[] a = arr.clone();
        Arrays.sort(a);


        for (int k = arr.length - 1; k >= 0; k--) {
            if(a[k] != arr[k]){
                return k;
            }
        }
        return -1;
    }
}
