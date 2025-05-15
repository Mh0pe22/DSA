import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupSubSequence1 {
    public static void main(String[] args) {
        String[] words = {"a" , "e" , "i" };
        int[] groups = { 0, 0 , 1};

        List<String> ans = getLongestSubsequence(words , groups);
        System.out.println(ans);
    }

    public static List<String> getLongestSubsequence(String[] words , int[] groups){
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            if(i == 0 || groups[i] != groups[i - 1]){
                ans.add(words[i]);
            }
        }

        return ans;
    }
}
