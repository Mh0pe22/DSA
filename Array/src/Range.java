import java.util.Arrays;

public class Range {

    public static void main(String[] args) {

        int[] arr = {1,1,2};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1}; // Empty array
        } else if (arr.length == 1) {
            if (arr[0] == target) {
                return new int[]{0, 0}; // Single element array with target
            } else {
                return new int[]{-1, -1}; // Single element array without target
            }
        } else if(arr.length == 2){
            if (arr[0] == target && arr[1] == target) {
                return new int[]{0, 1}; // Two elements with both being the target
            } else if (arr[0] == target) {
                return new int[]{0, 0}; // Two elements with only the first being the target
            } else if (arr[1] == target) {
                return new int[]{1, 1}; // Two elements with only the second being the target
            }
        }else {
            int left = binarySearchLeft(arr, target);
            int right = binarySearchRight(arr, target);
            return new int[]{left, right};
        }

        return new int[]{-1,-1};
    }
    static int binarySearchLeft(int[] arr , int target){

        int left = 0;
        int right = arr.length - 1;
        int leftIndex = -1;

        while(left <= right){

            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                leftIndex = mid;
                right = mid - 1;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }
            if(arr[mid] > target){
                right = mid - 1;
            }
        }

        return leftIndex;
    }

    static int binarySearchRight(int[] arr , int target){

        int left = 0;
        int right = arr.length - 1;
        int rightIndex = -1;

        while(left <= right){

            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                rightIndex = mid;
                left = mid + 1;
            }

            if(arr[mid] < target){
                left = mid + 1;
            }
            if(arr[mid] > target){
                right = mid - 1;
            }
        }

        return rightIndex;
    }
}
