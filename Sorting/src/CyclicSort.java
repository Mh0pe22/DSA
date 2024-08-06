import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){

        int i = 0;
        while (i < arr.length){

            int start = arr[i] - 1;
            if(arr[i] != arr[start]){
                swap(arr , i ,start);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
