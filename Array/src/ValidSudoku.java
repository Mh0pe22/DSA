import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board){
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> freq = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] >= '1' && board[i][j] <= '9') {
                    if (freq.contains(board[i][j])) {
                        return false;
                    } else {
                        freq.add(board[i][j]);
                    }
                }
            }
        }

        for (int col = 0; col < board[0].length; col++) {
            HashSet<Character> freq = new HashSet<>();
            for (int row = 0; row < board.length; row++) {
                if(board[row][col] >= '1' && board[row][col] <= '9') {
                    if (freq.contains(board[row][col])) {
                        return false;
                    } else {
                        freq.add(board[row][col]);
                    }
                }
            }
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> freq = new HashSet<>();
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        char c = board[boxRow + row][boxCol + col];
                        if (c != '.') {
                            if (freq.contains(c)) return false;
                            freq.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}
