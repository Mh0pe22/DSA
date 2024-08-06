public class CountRotation {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,1,2,3};
//        int[] arr = {5,4,2,2,2};
        System.out.println(pivotRotation(arr));
    }

    static int pivotRotation(int[] arr){

        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] >arr[mid + 1]){
                return mid;
            } else if (mid > start && arr [mid] < arr[mid -1]) {
                return mid -1;
            } else if (arr[start] > arr[mid]) {
                end = mid -1;
            }else {
                start = mid  +1;
            }
        }
        return -1;
    }
}
