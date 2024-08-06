import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if(isArmstrong(n1)){
            System.out.println(n1 + " is armstrong number");
        }
        if(isArmstrong(n2)){
            System.out.println(n2 + "is armstrong number");
        }
    }

    static boolean isArmstrong(int n){

        int original = n;
        int sum = 0;
        while(n != 0){
            int a = n % 10;
            sum = sum + (a*a*a);
            n = n/10;
        }
        return sum == original;
    }

}
