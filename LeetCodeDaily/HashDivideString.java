import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashDivideString {
    public static void main(String[] args) {
        String s = "mxz";
        int k = 3;
        System.out.println(hashString(s , k));
    }

    public static String hashString(String s , int k){
        Map<Character , Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            char c = (char)(97 + i);
            map.put(c  , i);
        }
        int length = s.length();
        int part = length / k;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < length; i += k) {
            String substring = s.substring(i, i + k);
            int sum = 0;

            for (int j = 0; j < substring.length(); j++) {
                sum += map.get(substring.charAt(j));
            }
            int hashedChar = sum % 26;
            char c = (char) (97 + hashedChar);
            ans.append(c);
        }

        return ans.toString();
    }
}
