import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }

        char person = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + person + "enter : ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = person;
                gameOver = haveWon(board , person);
                if(gameOver){
                    System.out.println("Player " + person + "has won !");
                }else {
                    person = (person == 'X') ? '0' : 'X';
                }
            }
        }

        printBoard(board);

    }

    private static boolean haveWon(char[][] board, char person) {

        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == person && board[row][1] == person && board[row][2] == person ){
                return true;
            }
        }

        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col] == person && board[1][col] == person && board[2][col] == person ){
                return true;
            }
        }

        if(board[0][0] == person && board[1][1] == person && board[2][2] == person){
            return true;
        }

        if(board[0][2] == person && board[1][1] == person && board[2][0] == person){
            return true;
        }

        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }


}
