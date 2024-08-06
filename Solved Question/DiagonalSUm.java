public class DiagonalSUm {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Sum : " + sum(arr));
    }

    static int sum(int[][] arr){

        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            firstDiagonal += arr[i][i];
            secondDiagonal += arr[i][arr.length -1 -i];
        }
        return firstDiagonal + secondDiagonal;
    }

}
