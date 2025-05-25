import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindrome(words));
    }

    public static int longestPalindrome(String[] words){
        Map<String , Integer> mp = new HashMap<>();
        int result = 0;

        for (String s : words) {
            String reversed = new StringBuilder(s).reverse().toString();

            if (mp.getOrDefault(reversed, 0) > 0) {
                result += 4;
                mp.put(reversed, mp.get(reversed) - 1);
            } else {
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (word.charAt(0) == word.charAt(1) && count > 0) {
                result += 2;
                break;
            }
        }

        return result;
    }
}
