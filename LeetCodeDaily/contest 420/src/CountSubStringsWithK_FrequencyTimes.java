import java.util.HashMap;
import java.util.Map;

public class CountSubStringsWithK_FrequencyTimes {
    public static void main(String[] args) {
        String s= "aabcdb";
        int k = 2;
        System.out.println(numOfSubStrings(s ,k));
    }

    public static int numOfSubStrings(String s , int k){

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> charCount = new HashMap<>();
            int maxFreq = 0;  // Keep track of the maximum frequency in the current window

            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
                charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
                maxFreq = Math.max(maxFreq, charCount.get(currentChar));

                if (maxFreq >= k) {
                    count += (n - j);
                    break;
                }
            }
        }

        return count;
    }
}
