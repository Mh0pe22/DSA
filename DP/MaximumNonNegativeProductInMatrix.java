public class MaximumNonNegativeProductInMatrix {
    public static void main(String[] args) {

    }

    class Pair {
        Long first;
        Long second;

        Pair(Long first, Long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int maxProducts(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        Pair[][] t = new Pair[m][n];
    }
}
