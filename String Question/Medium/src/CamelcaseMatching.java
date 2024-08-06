package Medium.src;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] arr = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBa";

        List<Boolean> ans = camelMatch(arr , pattern);
        for(Boolean i : ans){
            System.out.println(i);
        }
    }

    public static List<Boolean> camelMatch(String[] queries , String pattern){
        List<Boolean> ans = new ArrayList<>();

        for (String query : queries) {
            ans.add(check(query, pattern));
        }

        return ans;
    }

    public static boolean check(String s, String pattern){
        int i =0;
        int capital = 0;

        for (int j = 0; j < s.length(); j++) {
            if(i < pattern.length() && s.charAt(j) == pattern.charAt(i)){
                i++;
            } else if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                return false;
            }
        }
        return i == pattern.length();
    }
}
