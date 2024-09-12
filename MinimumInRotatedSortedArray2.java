public class MinimumInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {3,3,1,3};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
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
            if(arr[mid] < arr[e]){
                e  = mid;
            } else if (arr[mid] > arr[e]) {
                s = mid + 1;
            }else {
                e--;
            }
        }

        return arr[s];
    }
}
