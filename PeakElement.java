public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {0,1,4,4,5,6,7};
        System.out.println(peak(arr));
    }

//    There are multiple peak return any peak element index
    public static int peak(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        if(arr.length <= 1){
            return 0;
        }

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {

                s = mid + 1;
            }
        }
        return s;
    }
}
