public class SerachInMountainArray {

    public static void main(String[] args) {

        int [] arr= {0,1,2,4,2,1};
        System.out.println(Search(arr));
    }

    static int Search(int[] arr){

        int peak = mountainArray(arr);
        int firstHalf = OrderABS(arr, 2, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return OrderABS(arr, 2, peak, arr.length -1);
    }

    static int mountainArray(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        while(start < end){

            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    static  int OrderABS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
