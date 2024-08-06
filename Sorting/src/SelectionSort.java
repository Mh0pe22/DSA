import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i -1;
            int maxIndex = getIndedx(arr , last);
            swap(arr, maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getIndedx(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}

