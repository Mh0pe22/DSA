package Medium;

public class MinimumLengthOFStringAfterOperations {
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s){
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int len = 0;
        for (int i = 0; i < freq.length; i++) {
            int count = freq[i];

            while (count >= 3){
                count -= 2;
            }

            len += count;
        }

        return len;
    }
}
