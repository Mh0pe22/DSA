import java.util.Scanner;

public class hypotenuse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Enter value of x : ");
        x = scanner.nextDouble();
        System.out.println("Enter value of y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The value of z is " + z);

        scanner.close();
    }
}