import java.util.HashSet;

public class LongestNiceSubString {
    public static void main(String[] args) {
        String s = "YazaAay";
        System.out.println(longestNiceSubString(s));
    }

    public static String longestNiceSubString(String s){

        if(s.length() < 2){
            return "";
        }

        HashSet<Character> c = new HashSet<>();

        for(char i : s.toCharArray()){
            c.add(i);
        }

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(c.contains(Character.toUpperCase(ch)) && c.contains(Character.toLowerCase(ch))){
                continue;
            }

            String pre = longestNiceSubString(s.substring(0 , i));
            String post = longestNiceSubString(s.substring(i + 1));

            return (pre.length() >= post.length() ? pre : post);
        }

        return s;
    }
}
