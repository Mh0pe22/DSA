import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s){
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String ans = "";
        int index = 0;

        while (index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0');
                    index += 1;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(ans);
                ans = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(ans);
                }
                ans = temp.toString();
                index++;
            }else{
                ans += s.charAt(index);
                index++;
            }
        }
        return ans;
    }

}
