package Medium.src;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String pattern){
        int number = 1;
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= pattern.length(); i++) {
            st.push((char)(number + '0'));
            number++;

            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while (!st.isEmpty()){
                    sb.append(st.pop());
                }
            }

        }

        return sb.toString();
    }
}
