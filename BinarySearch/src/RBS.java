// Rotation Binary Search
//In rotation number are not duplicate
//If you don't find pivot then array is not rotated

public class RBS {

    public static void main(String[] args) {
//        int [] arr = {4,5,6,7,1,2,3};
        int[] arr = {5,4,2,2,2};
        System.out.println(findPivotWithDuplicates(arr));
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

    static int findPivotWithDuplicates(int[] arr){
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

//  If elements at start, middle and end all are equal than just skip the duplicates
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){

                if(arr[start] > arr[start +1 ]){
//                    Check if start is pivot
                    return start;
                }
                start++;

                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                    start = mid +1;
            }
            else {
                end = end -1;
            }

        }
        return -1;

    }
}
