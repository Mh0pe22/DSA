public class Main {
    public static void main(String[] args) {

        int [] arr = {11,22,7,8,1,16};
        int target = 22;
        System.out.println(Search(arr,target));
    }

    // Return index of target element
    static int Search(int[] arr, int target){

        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {

            int element = target;
            if (element == arr[index]) {
                    return index;
            }
        }
        return -1;
    }

    // Return true or false
    static boolean Search1(int[] arr, int target){

        if (arr.length == 0) {
            return false;
        }
        for (int i : arr) {

            int element = target;
            if (element == i) {
                return true;
            }
        }
        return false;
    }
}