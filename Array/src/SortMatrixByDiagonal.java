import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrixByDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 7, 3},
                {9, 8, 2},
                {4, 5, 6}
        };

        System.out.println(Arrays.toString(sortMatrix(mat)));
    }

    private static int n;

    private static void sortDiagonal(int r, int c, int[][] grid, boolean asc) {
        List<Integer> vec = new ArrayList<>();

        int i = r, j = c;
        while (i < n && j < n) {
            vec.add(grid[i][j]);
            i++;
            j++;
        }

        if (asc) {
            Collections.sort(vec); // ascending
        } else {
            vec.sort(Collections.reverseOrder()); // descending
        }

        i = r;
        j = c;
        for (int val : vec) {
            grid[i][j] = val;
            i++;
            j++;
        }
    }
    public static int[][] sortMatrix(int[][] grid){

        n = grid.length;

        // Bottom-left diagonals → sort in non-increasing order
        for (int row = 0; row < n; row++) {
            sortDiagonal(row, 0, grid, false);
        }

        // Top-right diagonals → sort in non-decreasing order
        for (int col = 1; col < n; col++) {
            sortDiagonal(0, col, grid, true);
        }

        return grid;
    }
}
