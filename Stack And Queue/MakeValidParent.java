import java.util.Stack;

public class MakeValidParent {

    public static void main(String[] args) {
        String s= "({[](((";
        System.out.println(countToMakeValid(s));
    }

    public static int countToMakeValid (String s){

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(c == ')'){
                    if(stack.peek() == '('){
                         stack.pop();
                    }
                }

                if(c == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }
                }

                if(c == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }
                }
            }
        }
        return stack.size();
    }
}
