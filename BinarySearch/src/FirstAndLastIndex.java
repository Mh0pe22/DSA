import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {

        int[] arr = {1,7,7,7,11,11,11,22,67};
        int target = 11;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int [] arr, int target){

        int []ans = {-1,-1};
        ans[0] = index(arr , target, true);
        if(ans[0] != -1){
            ans[1] = index(arr, target, false);
        }
        return ans;
    }

    static int index(int[] arr, int target, boolean isFirstIndex){

        int start = 0;
        int end = arr.length - 1;
        int ans  = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
