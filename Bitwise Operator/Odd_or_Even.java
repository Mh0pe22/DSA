import java.util.Scanner;

public class Odd_or_Even {

    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = in.nextInt();

        if ((a & 1) == 1){
            System.out.println("Number is odd");
        }else {
            System.out.println("Number is even");
        }
    }
}
