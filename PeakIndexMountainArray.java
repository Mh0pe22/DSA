public class PeakIndexMountainArray {
    public static void main(String[] args) {

        int[] arr = {18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){

        int s  =0;
        int e = arr.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(mid != 0 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid != 0 && arr[mid] < arr[mid - 1]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return e;
    }

}
