import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {2,1,3,3,4,5};
        System.out.println(Arrays.toString(misMatch(arr)));
    }
    static int[] misMatch(int[] arr){

        int i = 0;
        while (i < arr.length){

            int start = arr[i] -1;
            if(arr[i] != arr[start]){
                swap(arr , i ,start);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
               return new int[] {arr[index] , index +1};
            }

        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
