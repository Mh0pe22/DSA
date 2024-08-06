package Array;

public class TargetSum {

    public static void main(String[] args) {

        int[] num = {1000};
        int target = -1000;
        System.out.println(findTargetSumWays(num , target));

    }

//    static int findTargetSumWays(int[] arr , int target){
//
//
//        int count = 0;
//
//        if(arr.length <= 1){
//            if(arr[0] == 1 && target ==1){
//                return 1;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            int j = 0;
//
//            if(arr.length > 2) {
//                arr[i] = -1 * arr[i];
//            }
//            while(j != arr.length){
//                sum += arr[j];
//                j++;
//
//            }
//            if(sum == target){
//                count++;
//            }
//            if(arr.length > 2) {
//                arr[i] = -1 * arr[i];
//            }
//        }
//
//        return count;
//
//    }

    static int findTargetSumWays(int[] arr, int target) {
        return findWays(arr, target, 0, 0);
    }

    static int findWays(int[] arr, int target, int index, int sum) {

        if(arr.length == 1){
            if(arr[index] == target){
                return 1;
            }else{
                return 0;
            }
        }

        if (index == arr.length) {
            if(sum == target){
                return 1;
            }
            return 0;
        }

        return findWays(arr, target, index + 1, sum + arr[index]) + findWays(arr, target, index + 1, sum - arr[index]);
    }

}
