import java.util.HashSet;

public class CountASubstringContainingEveryVowelAndKConsonants1 {
    public static void main(String[] args) {

        String s = "iqeaouqi";
        int k = 2;
        System.out.println(countOfSubstring(s , k));
    }

    public static int countOfSubstring(String word, int k) {
        int ans = 0;
        int n = word.length();
        int windowSize = 5 + k;

        for (int i = 0; i <= n - windowSize; i++) {
            String s = word.substring(i, i + windowSize);
            if (containsAllVowelsOnce(s) && countConsonants(s) >= k) {
                ans++;
            }
        }

        return ans;
    }

    private static boolean containsAllVowelsOnce(String s) {
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');

        HashSet<Character> foundVowels = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (vowelSet.contains(c)) {
                if (foundVowels.contains(c)) {
                    return false; // Duplicate vowel found
                }
                foundVowels.add(c);
            }
        }

        // Check if all 5 vowels are found exactly once
        return foundVowels.size() == 5;
    }

    private static int countConsonants(String s) {
        int consonantCount = 0;
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                consonantCount++;
            }
        }
        return consonantCount;
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
