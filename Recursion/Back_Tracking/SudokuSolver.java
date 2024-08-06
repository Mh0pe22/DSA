package Back_Tracking;

public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        if(solve(board)){
            display(board);
        }else{
            System.out.println("Cannot solve");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(board[i][j] == 0){
                    row  = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found empty element in row than break
            if (!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true;
            // sudoku is solved
        }
        
        // backtrack
        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board , row, col , number)){
                board[row][col] = number;
                if(solve(board)){
                    // found your answer
                    return true;
                }else{
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    static void display(int[][] board){
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board , int row ,int col , int num){
        // Check the row
        for (int i = 0; i < board.length; i++) {
            //Check the number in row
            if(board[i][col] == num){
                return false;
            }
        }

        // Check the Column
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i <rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {

                if(board[i][j] == num){
                    return false;
                }

            }

        }

        return true;
    }
}
