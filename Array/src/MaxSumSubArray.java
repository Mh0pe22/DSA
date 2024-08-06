public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }

//    static int maxSum(int[] arr){
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//
//            for (int j = i; j < arr.length; j++) {
//
//                sum +=  arr[j];
//                if(max < sum){
//                    max = sum;
//                }
//            }
//
//
//        }
//
//        return max;
//    }

    static int maxSum(int[] arr){
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
