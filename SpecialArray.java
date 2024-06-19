import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {

        int[] arr= {1,1,2};
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] arr){

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int s = 0;
            int e = arr.length - 1;
             while(s <= e){
                 int mid = s + (e - s)/2;

                 if(mid == 0 && arr[mid] > i + 1){
                     return arr.length;
                 }

                 if(mid != 0 && arr[mid] >= i + 1 && arr[mid - 1] < i + 1){
                     int count = arr.length - mid;
                     if(count == i+ 1) {
                         return i + 1;
                     }
                     s++;
                 }

                 if(arr[mid] < i + 1){
                     s = mid + 1;
                 }

                 if(mid != 0 && arr[mid] >= i + 1 && arr[mid - 1] >= i + 1){
                     e = mid;
                 }

             }
        }

        return -1;
    }
}
