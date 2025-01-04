package Medium.src;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength_3_PalindromicSubSequence {
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }

    public static int countPalindromicSubsequence(String s){
        Set<Character> ch = new HashSet<>();

        int count = 0;

        for(char i : s.toCharArray()){
            ch.add(i);
        }

        for(char c : ch){
            int left_idx = -1;
            int right_idx = -1;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c){
                    if(left_idx == -1){
                        left_idx = i;
                    }
                    right_idx = i;
                }
            }

            Set<Character> chUnique = new HashSet<>();
            for(int i = left_idx + 1; i <= right_idx - 1; i++){
                chUnique.add(s.charAt(i));
            }

            count += chUnique.size();
        }

        return count;
    }
}
