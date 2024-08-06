package Array;

public class ConsecutiveDuplicates {

    public static void main(String[] args) {

        duplicate("" , "Moohit");
    }

    static void duplicate(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        String rest = up.substring(1);

        // If the rest of the string is not empty and the first character is the same as the second character,
        // skip the first character
        if (!rest.isEmpty() && ch == rest.charAt(0)) {
            duplicate(p, rest);
        } else {
            duplicate(p + ch, rest);
        }
    }
}
