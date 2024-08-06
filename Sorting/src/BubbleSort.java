import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){

        boolean swapped = false;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length - i -1; j++) {

                if(arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                if(!swapped){
                    break;
                }
            }
        }
    }
}