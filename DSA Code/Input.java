import java.util.Scanner;

public class Input {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");

        String name = scanner.nextLine();
        
        
        System.out.println("What is your age ? ");
        int age = scanner.nextInt();
        
        System.out.println("What is your favourite food ?");
        scanner.nextLine();
        String food = scanner.nextLine();

        System.out.println("Your name is "+name);
        System.out.println("You are "+age+"years old");
        System.out.println("You like "+food);
     
        scanner.close();
    }
}
