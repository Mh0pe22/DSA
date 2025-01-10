package Medium;

import java.util.ArrayList;
import java.util.List;

public class WordSubSet {
    public static void main(String[] args) {

        String[] word1 = {"amazon","apple","facebook","google","leetcode"};
        String[] word2 = {"a" , "e"};

        System.out.println(wordSubSets(word1 , word2));
    }

    public static List<String> wordSubSets(String[] word1 , String[] word2){
        List<String> ans = new ArrayList<>();

        int[] freq2 = new int[26];
        for(String word : word2){
            int[] temp = new int[26];

            for(char ch : word.toCharArray()){
                temp[ch - 'a']++;

                freq2[ch - 'a'] = Math.max(temp[ch - 'a'] , freq2[ch - 'a']);
            }
        }

        for(String word : word1){
            int[] temp = new int[26];

            for(char ch : word.toCharArray()){
                temp[ch - 'a']++;
            }

            if(isSubSet(temp , freq2)){
                ans.add(word);
            }
        }

        return ans;
    }

    private static boolean isSubSet(int[] temp , int[] freq){
        for (int i = 0; i < 26; i++) {
            if(temp[i] < freq[i]){
                return false;
            }
        }

        return true;
    }
}
