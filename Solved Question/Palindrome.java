import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input =in.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i =  input.length() -1; i >=0; i--) {

            output.append(input.charAt(i));
        }
        if (input.contentEquals(output)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
