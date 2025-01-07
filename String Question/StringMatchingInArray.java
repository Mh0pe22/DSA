import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {

        String[] words = {"mass", "as" ,"hero" , "superhero"};
        List<String> ans = stringMatching(words);

        System.out.println(ans);
    }

    public static List<String> stringMatching(String[] words){
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length ; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i == j){
                    continue;
                }

                if(words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
