package Medium.src;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }

    public static int calculate(String s){
        // Stack<Integer> st = new Stack<>();
        int last = 0;
        int sum = 0;
        char[] ch = s.toCharArray();
        char op = '+';
        int curr = 0;

        for (int i = 0; i < ch.length; i++) {
            if(Character.isDigit(ch[i])){
                curr = curr * 10 + ch[i] - '0';
            }

            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1){
                if(op == '+'){
                    // st.push(curr);
                    sum += last;
                    last = curr;
                }else if (op == '-'){
                    // st.push(-curr);
                    sum += last;
                    last = -curr;
                } else if (op == '*') {
                    // st.push(st.pop() * curr);
                    last = last * curr;
                } else if (op == '/') {
                    // st.push(st.pop() / curr);
                    last = last / curr;
                }

                op = ch[i];
                curr = 0;
            }
        }

        sum += last;
        // int sum = 0;
        // while (!st.isEmpty()){
        //     sum +=st.pop();
        // }

        return sum;
    }
}
