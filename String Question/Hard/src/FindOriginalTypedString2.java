import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOriginalTypedString2 {
    public static void main(String[] args) {
        String words = "aabbccdd";
        int k  = 7;
        System.out.println(possibleString(words , k));
    }

    private static int M = (int)1e9 + 7;
    public static int possibleString(String word , int k){
        if(k > word.length())
            return 0;

        List<Integer> freq = new ArrayList<>();
        int count  =1;
        for (int i = 1; i < word.length() ; i++) {
            if(word.charAt(i) == word.charAt(i - 1)){
                count++;
            }else{
                freq.add(count);
                count = 1;
            }
        }
        freq.add(count);

        long P = 1;
        for(int f : freq){
            P = (P * f) % M;
        }

        if(freq.size() >= k){
            return (int)P;
        }

        int n = freq.size();
        int[][] t = new int[n + 1][k + 1];

        for (int c = k - 1; c >= 0 ; c--) {
            t[n][c] = 1;
        }

        for (int i = n - 1; i >= 0 ; i--) {
            int[] prefix = new int[k + 2];
            for (int h = 1; h <= k ; h++) {
                prefix[h] = (prefix[h - 1] + t[i + 1][h - 1]) % M;
            }

            for (int c = k - 1; c >= 0 ; c--) {
                int l = c + 1;
                int r = c + freq.get(i);

                if(r + 1 > k){
                    r = k - 1;
                }

                if(l <= r){
                    t[i][c] = (prefix[r + 1] - prefix[l] + M) % M;
                }
            }
        }

        long invalidCount = t[0][0];

        return (int)(P - invalidCount + M) % M;
    }

}
