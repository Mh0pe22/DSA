import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LexicographicallySmallestEquivalentString {
    public static void main(String[] args) {
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";

        System.out.println(smallestEquivalentString(s1 , s2, baseStr));
    }

    public static String smallestEquivalentString(String s1 , String s2 , String baseStr){
        int n = s1.length();

        int N = baseStr.length();

        Map<Character , List<Character>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            adj.putIfAbsent(ch1 , new ArrayList<>());
            adj.get(ch1).add(ch2);

            adj.putIfAbsent(ch2 , new ArrayList<>());
            adj.get(ch2).add(ch1);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char ch = baseStr.charAt(i);

            boolean[] visited = new boolean[26];
            ans.append(DfsFindingMinChar(adj , ch , visited));
        }

        return ans.toString();
    }

    public static char DfsFindingMinChar(Map<Character , List<Character>> adj , char currChar ,  boolean[] visited){
        visited[currChar - 'a'] = true;

        char minChar = currChar;
        for(char neighbor : adj.getOrDefault(currChar , new ArrayList<>())){
            if(!visited[neighbor - 'a']){
                char nextMin = DfsFindingMinChar(adj , neighbor , visited);
                minChar = minChar < nextMin ? minChar : nextMin;
            }
        }
        return minChar;
    }
}
