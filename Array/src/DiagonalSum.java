public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr= {
                {2,10,5,10},
                {1,7,1,4},
                {2,6,5,3},
                {2,5,7,8}
        };
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] arr){

        if(arr.length == 1){
            return arr[0][0];
        }
//        int  firstRow = arr[0][0] + arr[0][arr.length-1];
//        int  lastRow = arr[arr.length-1][0] + arr[arr.length-1][arr.length-1];
//        int mid = arr.length / 2;
//        int midArr = 0;
//        if((mid % 2 )!= 0){
//            midArr = arr[mid][mid];
//        }else{
//            int mid1 = arr[mid - 1][mid - 1]+ arr[mid - 1][mid];
//            int mid2 = arr[mid][mid - 1] + arr[mid][mid];
//            midArr = mid1 + mid2;
//        }
//
//        return firstRow + lastRow + midArr;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        int a = 0;
        for (int i = arr.length - 1; i >=0 ; i--) {
            sum += arr[i][a];
            a++;
        }
        int mid = arr.length / 2;
        if(arr.length % 2 == 0){
            return sum;
        }

        return sum - arr[mid][mid];
    }
}
