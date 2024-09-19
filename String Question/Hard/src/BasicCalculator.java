import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s= "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }

    public static int calculate(String s){
        int num = 0;
        int sign = 1;
        int result = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i))){
                num = (num * 10) + (s.charAt(i) - '0');
            } else if (s.charAt(i) == '+') {
                result += (num * sign);
                sign = 1;
                num = 0;
            } else if (s.charAt(i) == '-') {
                result += (num * sign);
                sign = -1;
                num = 0;
            } else if (s.charAt(i) == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                num = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                result += (num * sign);
                num = 0;

                int stak_sign = st.peek();
                st.pop();
                int last_result = st.peek();
                st.pop();

                result *= stak_sign;
                result += last_result;
            }
        }
        result += (num * sign);

        return result;
    }
}
