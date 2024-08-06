import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{()}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                parentheses.push(s.charAt(i));
            }else {
                if(s.charAt(i) == ')'){
                    if(parentheses.isEmpty() || parentheses.pop() != '('){
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                   if(parentheses.isEmpty() || parentheses.pop() != '['){
                       return false;
                   }
                }else if(s.charAt(i) == '}'){
                    if(parentheses.isEmpty() || parentheses.pop() != '{'){
                        return false;
                    }
                }
            }
        }
        return parentheses.isEmpty();
    }
}
