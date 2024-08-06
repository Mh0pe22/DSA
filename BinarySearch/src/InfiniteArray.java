public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4,5,6};
        int target= 3;
        System.out.println(index(arr , target));
    }

    static int index(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end] ){
            int temp = end + 1;
            end = end + (end  - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr , int target, int start, int end){

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {

                start = mid + 1;
            }
            else if (arr[mid] > target) {

                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
