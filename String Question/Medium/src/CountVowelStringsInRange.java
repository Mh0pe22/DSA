package Medium.src;

import java.util.Arrays;

public class CountVowelStringsInRange {
    public static void main(String[] args) {
        String[] words = {"aba", "bcb","ece","aa" ,"e"};
        int[][] queries = {
                {0,2},
                {1,4},
                {1,1}
        };
        System.out.println(Arrays.toString(vowelStrings(words , queries)));
    }

    public static int[] vowelStrings(String[] words , int[][] queries){

        int[] cumSum = new int[words.length];
         int[] ans = new int[queries.length];

        String vowels = "aeiou";

        for (int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            if (vowels.indexOf(first) != -1 && vowels.indexOf(last) != -1) {
                cumSum[i] = (i > 0 ? cumSum[i - 1] : 0) + 1;
            } else {
                cumSum[i] = i > 0 ? cumSum[i - 1] : 0;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                ans[i] = cumSum[end];
            } else {
                ans[i] = cumSum[end] - cumSum[start - 1];
            }
        }

        return ans;
    }
}
