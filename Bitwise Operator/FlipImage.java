import java.util.Arrays;

public class FlipImage {

    public static void main(String[] args) {

        int[][] image= {
                {1,0,1},
                {0,0,0},
                {1,1,0}
        };
        System.out.println(Arrays.deepToString(flipImage(image)));
    }

    static int[][] flipImage(int[][] arr){

        for(int[] row : arr){

            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {

                int temp = row[i] ^ 1;
                row[i] = row[arr.length - i -1] ^ 1;
                row[arr.length - i -1] = temp;

            }
        }
        return arr;
    }
}
