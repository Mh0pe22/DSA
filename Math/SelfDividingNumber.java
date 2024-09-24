import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;
        List<Integer> ans = selfDividingNumbers(left , right);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public static List<Integer> selfDividingNumbers(int left , int right){
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            boolean a = isSelfDivide(i);
            if(a){
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean isSelfDivide(int num){
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            int div = Integer.parseInt(String.valueOf(s.charAt(i)));

            if(div == 0 || num % div != 0){
                return false;
            }
        }
        return true;
    }
}
