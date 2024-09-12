public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {3,3,1,3};
        System.out.println(minimum(arr));
    }

    public static int minimum(int[] arr){

        int s = 0;
        int e = arr.length - 1;

        if(arr.length <= 1){
            return arr[0];
        }

        if(arr.length == 2){
            return Math.min(arr[0] , arr[1]);
        }

        while(s < e){
            int mid = s + (e - s) / 2;

            if( mid != 0 && arr[mid - 1] > arr[mid] && arr[mid + 1] > arr[mid]){
                return arr[mid];
            }

            if(arr[s] < arr[mid] && arr[e] > arr[mid] ){
                e = mid - 1;
            }else if(arr[mid] > arr[s] && arr[mid] > arr[e]){
                s = mid + 1;
            }else{
                s++;
                e--;
            }
        }

        return Math.min(arr[s], arr[e]);
    }
}
