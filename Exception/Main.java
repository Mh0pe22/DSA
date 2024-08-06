package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
    try{
        int x;
        System.out.println("Enter a whole number to divide : ");
        x = scanner.nextInt();

        int y;
        System.out.println("Enter a whole number to divide : ");
        y = scanner.nextInt();

        int z = x/y;
        System.out.println("Result : " + z);
    }

    catch(ArithmeticException e){
        System.out.println("Number is not divide by zero BRO!!!");
    }

    catch(InputMismatchException e){

        System.out.println("Enter a number DUDE!!!");
    }

    catch(Exception e){
        System.out.println("Something went wrong!!! ");
    }

    finally{
        scanner.close();
    }
    }
}
