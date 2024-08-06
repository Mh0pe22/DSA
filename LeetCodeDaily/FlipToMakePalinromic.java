public class FlipToMakePalinromic {
    public static void main(String[] args) {
        int[][] arr = {{0,1},
                {0,1},
                {0,0}
        };
        System.out.println(minFlip(arr));
    }
    public static int minFlip(int[][] grid){

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int j = 0;
            int length = grid[0].length - 1;
            while (j < length) {
                if (grid[i][j] != grid[i][length]) {
                    count++;
                }
                j++;
                length--;
            }
        }

        int count1 = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int j = 0;
            int length = grid.length - 1;
            while (j < length) {
                if (grid[j][i] != grid[length][i]) {
                    count1++;
                }
                j++;
                length--;
            }
        }
        return Math.min(count, count1);

    }
}
