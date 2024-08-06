import java.util.ArrayList;

public class for_each {
    
    public static void main(String[] args) {
        
        // String[] names = new String[] {"Mohit" , "Kemil" , "Hemanshu", "Aryan"};

        ArrayList<String> gods = new ArrayList<String>();
        gods.add("Krishna");
        gods.add("Radha");

        for (String i : gods) {

            System.out.println(i);
        }
    }
}
