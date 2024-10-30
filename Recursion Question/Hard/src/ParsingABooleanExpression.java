import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParsingABooleanExpression {
    public static void main(String[] args) {
        String s = "&(|(f))";
        System.out.println(parseBoolExpr(s));
    }

    // using stack
    public static boolean parseBoolExpr(String expression){

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {

            if(expression.charAt(i) == ','){
                continue;
            }else {
                if(expression.charAt(i) == ')'){
                    List<Character> ch = new ArrayList<>();
                    while(st.peek() != '('){
                        ch.add(st.pop());
                    }

                    st.pop();
                    char op = st.pop();

                    st.push(operation(ch , op));
                }else {
                    st.push(expression.charAt(i));
                }
            }
        }

        return st.peek() == 't';
    }

    public static char operation(List<Character> ch , char operator){

        if(operator == '!'){
            return ch.getFirst() == 't' ? 'f' : 't';
        }

        if(operator == '|'){
            for (Character character : ch) {
                if (character == 't') {
                    return 't';
                }
            }
            return 'f';
        }else {

            // if ch == '&
            for (Character character : ch) {
                if (character == 'f') {
                    return 'f';
                }
            }
            return 't';
        }
    }
}
