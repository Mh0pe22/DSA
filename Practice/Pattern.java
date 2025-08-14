public class Pattern {
    public static void main(String[] args) {

        int n = 4;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
        pattern(n);
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

    /*
    1    1
    12  21
    123321
     */
    static void pattern(int n){
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + Integer.toString(i + 1);
            System.out.print(s);
            int space = (n * 2) - ((i + 1) * 2);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            StringBuilder rev = new StringBuilder(s).reverse();
            System.out.print(rev);
            System.out.println();
        }
    }
}
