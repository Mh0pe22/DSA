import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public static void main(String[] args) {
        String s =  "2*3-4*5";
        List<Integer> ans = differentWaysToCompute(s);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public static List<Integer> differentWaysToCompute(String expression){
            return solve(expression);
    }

    public static List<Integer> solve(String s){
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'){
                List<Integer> left_ans = solve(s.substring(0 , i));
                List<Integer> right_ans = solve(s.substring(i  +1));

                for(int left : left_ans){
                    for(int right : right_ans){
                        if(s.charAt(i) == '+'){
                            ans.add(left * right);
                        } else if (s.charAt(i) == '-') {
                            ans.add(left - right);
                        }else{
                            ans.add(left * right);
                        }
                    }
                }
            }
        }

        if(ans.isEmpty()){
            ans.add(Integer.parseInt(s));
        }

        return ans;
    }
}
