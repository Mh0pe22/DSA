public class Main {
    public static void main(String[] args) {

        int[] arr = {11,22, 45, 78 , 80, 93};
        int target = 93;
        System.out.println(Binary(arr, target));
    }

    static int Binary(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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