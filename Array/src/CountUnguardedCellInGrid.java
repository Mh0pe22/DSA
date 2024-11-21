public class CountUnguardedCellInGrid {
    public static void main(String[] args) {

        int m =3;
        int n =3;
        int[][] guard = {
                {1,1}
        };

        int[][] wall = {
                {0,1},
                {1,0},
                {2,1},
                {1,2}
        };

        System.out.println(countUnguarded(m , n , guard , wall));
    }
    public static int countUnguarded(int m , int n, int[][] guards, int[][] walls) {

        int[][] grid = new int[m][n];

        for (int[] g : guards) {
            int i = g[0];
            int j = g[1];
            grid[i][j] = 1; // 1 for guard
        }

        for (int[] w : walls) {
            int i = w[0];
            int j = w[1];
            grid[i][j] = 2; // 2 for wall
        }

        for (int[] guard : guards) {
            int i = guard[0];
            int j = guard[1];
            guarded(i, j, grid);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void guarded(int row , int col , int[][] grid){
        //up
        for (int i = row - 1; i >= 0 ; i--) {
            if(grid[i][col] == 2 || grid[i][col] == 1){
                break;
            }
            grid[i][col] = -1; // guarded
        }

        // down
        for (int i = row + 1; i < grid.length ; i++) {
            if(grid[i][col] == 2 || grid[i][col] == 1){
                break;
            }
            grid[i][col] = -1;
        }

        // left
        for (int i = col - 1; i >= 0 ; i--) {
            if(grid[row][i] == 2 || grid[row][i] == 1){
                break;
            }
            grid[row][i] = -1;
        }

        // right
        for (int i = col + 1; i < grid[0].length ; i++) {
            if(grid[row][i] == 2 || grid[row][i] == 1){
                break;
            }
            grid[row][i] = -1;
        }
    }
}
