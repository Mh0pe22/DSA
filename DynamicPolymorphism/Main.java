package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Human human;
        System.out.println("What is your sex ?");
        System.out.println("Enter 1 for man or Enter 2 for woman :");
        int choice = scanner.nextInt();

        if(choice == 1){
            human = new Man();
            human.sex();
        }
        else if(choice == 2){
            human = new Woman();
            human.sex();
        }
        else{
            human = new Human();
            human.sex();
        }
        scanner.close();
    }
}
