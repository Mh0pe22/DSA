import java.util.Arrays;

public class MinimumDeletionToMakeStringKSpecial {
    public static void main(String[] args) {
        String s = "aabcaba";
        int k = 0;
        System.out.println(minimumDeletion(s , k));
    }

    public static int minimumDeletion(String word , int k){
        int[] freq = new int[26];
        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int result = word.length();
        int cumulativeDel = 0;
        for (int i = 0; i < 26; i++) {
            int del = cumulativeDel;
            for (int j = 25; j > i ; j--) {
                if(freq[j] - freq[i] <= k)
                    break;

                del += freq[j] - freq[i] - k;
            }

            result = Math.min(result , del);
            cumulativeDel += freq[i];
        }

        return result;
    }
}
