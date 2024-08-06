public class RichestWealth {

    public static void main(String[] args) {
        int[][] arr= {
                {1,2},
                {3,4},
                {5,6}
        };

        System.out.println(wealth(arr));
    }

    public static int wealth(int[][] arr){

        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }

        return max;
    }
}
