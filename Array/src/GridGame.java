import java.util.Arrays;

public class GridGame {
    public static void main(String[] args) {
        int[][] grid = {
                {2,5,4},
                {1,5,1}
        };

        System.out.println(gridGame(grid));
    }

    public static long gridGame(int[][] grid){
        long firstRowRemainSum = 0;
        for (int num : grid[0]) {
            firstRowRemainSum += num;
        }

        long secondRowRemainSum = 0;

        long minimizedRobot2Sum = Long.MAX_VALUE;
        for (int col = 0; col < grid[0].length; col++) {
            firstRowRemainSum -= grid[0][col];

            long bestRobot2 = Math.max(firstRowRemainSum , secondRowRemainSum);
            minimizedRobot2Sum = Math.min(bestRobot2 , minimizedRobot2Sum);

            secondRowRemainSum += grid[1][col];
        }

        return minimizedRobot2Sum;
    }
}
