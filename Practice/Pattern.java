public class Pattern {
    public static void main(String[] args) {

        int n = 7;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
        pattern28(n);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int rows = 1; rows <2 * n ; rows++) {

            int totalCol = rows <= n ? rows : n - rows % n;

            for (int j = 1; j <= totalCol ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int rows = 1; rows <2 * n ; rows++) {

            int totalCol = rows <= n ? rows : n - rows % n;

            int totalSpaces = n - totalCol;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalCol ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
