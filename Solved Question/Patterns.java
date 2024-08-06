public class Patterns {

    public static void main(String[] args) {

//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(5);
//        pattern6(5);
        pattern7(5);
    }

    static void pattern1(int n){

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
/*
        *
        **
        ***
        ****
 */
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
/*
        *****
        ****
        ***
        **
        *
 */
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
/*
        1
        1 2
        1 2 3
        1 2 3 4
 */
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        /*
            *
            * *
            * * *
            * * * *
            * * *
            * *
            *
         */
        for (int row = 1; row <= 2 * n ; row++) {

            int totalRow = row > n ? 2 * n - row : row;
            for (int i = 1; i <= totalRow ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        /*
                *
               * *
              * * *
             * * * *
              * * *
               * *
                *
        */
        for (int row = 1; row <= 2 * n ; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row;
            int totalSpace = n -totalColsInRow;

            for (int i = 1; i <= totalSpace ; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= totalColsInRow ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        /*
                   1
                 2 1 2
               3 2 1 2 3
            4  3 2 1 2 3 4
         */

        for (int row = 1; row <=n ; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int j = row; j >= 1 ; j--) {
                System.out.print(j + " ");
            }

            for (int k = 2; k <= row; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }


}
