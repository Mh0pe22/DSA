package Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingARobotToPrintLexicographicallySmallestString {
    public static void main(String[] args) {
        String s = "zza";
        System.out.println(robotWithString(s));
    }

    public static String robotWithString(String s){
        int n = s.length();

        char[] minCharToRight = new char[n];
        minCharToRight[n - 1] = s.charAt(n -1);

        for (int i = n - 2; i >= 0 ; i--) {
            minCharToRight[i] = s.charAt(i) < minCharToRight[i + 1] ? s.charAt(i) : minCharToRight[i + 1];
        }
        int i = 0;
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder paper = new StringBuilder();

        while (i < n){
            stack.push(s.charAt(i));
            char minChar = (i + 1) < n ? minCharToRight[i + 1] : s.charAt(i);

            while (!stack.isEmpty() && stack.peek() <= minChar){
                paper.append(stack.pop());
            }
            i++;
        }

        while (!stack.isEmpty()){
            paper.append(stack.pop());
        }

        return paper.toString();
    }
}
