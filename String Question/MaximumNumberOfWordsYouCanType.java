import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
        String text =  "hello world";
        String brokenLetters = "ad";

        System.out.println(canBeTypedWords(text , brokenLetters));
    }

    public static int canBeTypedWords(String text , String brokenLetters){
        Set<Character> ch = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            ch.add(c);
        }

        String[] words = text.split(" ");
        int ans = words.length;
        for(String word : words){
            for(char c : word.toCharArray()){
                if(ch.contains(c)){
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}
