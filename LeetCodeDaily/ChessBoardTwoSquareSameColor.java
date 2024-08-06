public class ChessBoardTwoSquareSameColor {
    public static void main(String[] args) {
        String s1 = "a1";
        String s2 = "c3";
        System.out.println(checkTwoChessBoards(s1 , s2));
    }

    public static boolean checkTwoChessBoards(String s1, String s2){
        int firstChar = s1.charAt(0) - 'a';
        int firstPos = Integer.parseInt(String.valueOf(s1.charAt(1))) - 1;

        int secondChar = s2.charAt(0) - 'a';
        int secondPos = Integer.parseInt(String.valueOf(s2.charAt(1))) - 1;

        return (firstChar + firstPos) % 2 == (secondChar + secondPos) % 2;
    }
}
