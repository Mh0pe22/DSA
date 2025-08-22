public class FindTheMinimumAreaToCoverAllOnes1 {
    public static void main(String[] args) {
        int[][] grid = {
                {0 , 1, 0},
                {1 , 0, 1}
        };

        System.out.println(minimumArea(grid));
    }

    public static int minimumArea(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int minRow = m ;
        int maxrow = -1;

        int minCol = n;
        int maxCol = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1){
                    minRow = Math.min(minRow , i);
                    maxrow = Math.max(maxrow , i);

                    minCol = Math.min(minCol , j);
                    maxCol = Math.max(maxCol , j);
                }
            }
        }

        return (maxrow - minRow + 1) * (maxCol - minCol + 1);
    }
}
