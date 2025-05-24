import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int i, space, rows, k;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        for (i = 1; i <= rows; ++i) {
            k = 0;

            for (space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        scanner.close();
    }
}
