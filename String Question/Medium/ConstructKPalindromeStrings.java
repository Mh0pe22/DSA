package Medium;

public class ConstructKPalindromeStrings {
    public static void main(String[] args) {

        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s , k));
    }

    public static boolean canConstruct(String s , int k){

        int[] freq = new int[26];
        int size = s.length();

        if(size < k){
            return false;
        }

        if(size == k){
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int oddCount = 0;

        for (int j : freq) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= k;
    }
}
