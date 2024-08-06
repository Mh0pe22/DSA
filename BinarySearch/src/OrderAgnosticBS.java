public class OrderAgnosticBS {

    public static void main(String[] args) {
//        int[] arr = {99,87, 76, 65, 54, 43,22,11};
        int[] arr = {11,22,34,56,78,93};
        int target = 22;
        System.out.println(OrderABS(arr , target));
    }

    static  int OrderABS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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
