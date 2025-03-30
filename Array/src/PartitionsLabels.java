import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionsLabels {
    public static void main(String[] args) {
        String s= "ababcbacadefegdehijhklij";
        System.out.println(partitionsLabels(s));
    }

    public static List<Integer> partitionsLabels(String s){
        int[] charIdx = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            charIdx[idx] = i;
        }

        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int i = 0;
        int end = 0;
        while(i < s.length()){
            end = Math.max(end , charIdx[s.charAt(i) - 'a']);
            if(i == end){
                ans.add(end - start + 1);
            }
            i++;
        }
        return ans;
    }
}
