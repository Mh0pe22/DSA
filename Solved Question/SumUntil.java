import java.util.Scanner;

public class SumUntil {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number, and when you want to exit, enter 'x':");
        int sum = 0;
        int a;
        String exist;
        do {
            a = in.nextInt();
            sum += a;
            System.out.println("Enter 'x' if you want to exit or 'y' to continue:");
            exist = in.next();

        } while (!exist.equalsIgnoreCase("x"));
        System.out.println("Sum is: " + sum);
    }
}
