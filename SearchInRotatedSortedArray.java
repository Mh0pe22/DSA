import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,0,1,1,1};
        System.out.println(targetElement(arr , 0));
    }

    public static int targetElement(int[] arr , int target){

        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (arr[s] <= arr[mid]) { // Left half is sorted
                if (arr[s] <= target && target < arr[mid]) {
                    e = mid - 1; // Target is in the left half
                } else {
                    s = mid + 1; // Target is in the right half
                }
            } else { // Right half is sorted
                if (arr[mid] < target && target <= arr[e]) {
                    s = mid + 1; // Target is in the right half
                } else {
                    e = mid - 1; // Target is in the left half
                }
            }
        }
        return -1;
    }

}
