public class CommandLineExample {
    public static void main(String[] args) {
        // args is an array of Strings
        System.out.println("Number of arguments: " + args.length);


        // Loop through and print each argument
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}