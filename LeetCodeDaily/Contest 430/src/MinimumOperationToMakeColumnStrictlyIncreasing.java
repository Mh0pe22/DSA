public class MinimumOperationToMakeColumnStrictlyIncreasing {
    public static void main(String[] args) {
        int[][] arr= {
                {3,2},
                {1,3},
                {3,4},
                {0,1}
        };
        System.out.println(minimumOperation(arr));
    }

    public static int minimumOperation(int[][] grid ){

        int operation = 0;

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++) {
                if(grid[j-1][i] >= grid[j][i]){
                    int diff = grid[j-1][i] - grid[j][i] + 1;
                    operation += diff;
                    grid[j][i] += diff;
                }

            }
        }

        return operation;
    }
}
