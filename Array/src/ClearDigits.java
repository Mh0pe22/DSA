import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch) && !st.isEmpty()){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
