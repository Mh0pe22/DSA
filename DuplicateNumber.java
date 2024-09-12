import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr ={3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int [] arr){
        Arrays.sort(arr);
        return binary(arr , 0, arr.length - 1);
    }

    public static int binary(int[] arr , int s , int e){

            if(s >= e){
                return -1;
            }
            int mid = s + (e - s) /2;

            if(mid != 0 && mid != arr.length - 1 && arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + 1]){
                return arr[mid];
            }

            int left = binary(arr , s , mid);
            if(left != -1){
                return left;
            }

            return binary(arr , mid + 1 , e);
    }
}
