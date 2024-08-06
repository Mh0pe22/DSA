public class NumberOfWiningPlayer {

    public static void main(String[] args) {
        int[][] arr = {
                {0,0},
                {1,0},
                {1,0},
                {2,1},
                {2,1},
                {2,0}
        };

        int n = 4;
        System.out.println(winningPlayerCount(n , arr));
    }
    public static int winningPlayerCount(int n, int[][] pick) {
        int numColors = 100;
        int[][] colorCount = new int[n][numColors];

        for (int[] entry : pick) {
            int player = entry[0];
            int color = entry[1];
            colorCount[player][color]++;
        }

        int winners = 0;

        for (int player = 0; player < n; player++) {
            for (int color = 0; color < numColors; color++) {
                if (colorCount[player][color] > player) {
                    winners++;
                    break;
                }
            }
        }

        return winners;
    }
}
