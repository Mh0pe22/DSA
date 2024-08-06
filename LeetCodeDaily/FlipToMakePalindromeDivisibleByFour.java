public class FlipToMakePalindromeDivisibleByFour {
    public static void main(String[] args) {
        int[][] arr={
                {1,0},
                {0,1},
                {0,0}
        };
        System.out.println(minFlip(arr));
    }

    public static int minFlip(int[][] grid){


        int totalFlips = 0;
        int oneCount = 0;
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    oneCount++;
                }
            }
        }

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


        int minFlipsToPalindrome = Math.min(count, count1);
        int remainder = oneCount % 4;
        if (remainder != 0) {
            int adjustmentFlips = (4 - remainder) % 4;
            minFlipsToPalindrome += adjustmentFlips;
        }

        return minFlipsToPalindrome;

    }
}
