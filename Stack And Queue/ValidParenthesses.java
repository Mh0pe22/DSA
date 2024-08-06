import java.util.Stack;

public class ValidParenthesses {

    public static void main(String[] args) {

        String s = "({[}])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(c == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }

                if(c == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }

                if(c == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
