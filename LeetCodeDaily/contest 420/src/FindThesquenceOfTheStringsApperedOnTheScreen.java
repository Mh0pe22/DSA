import java.util.ArrayList;
import java.util.List;

public class FindThesquenceOfTheStringsApperedOnTheScreen {
    public static void main(String[] args) {

        String target = "he";
        System.out.println(new ArrayList<>(stringSequence(target)));
    }

    public static List<String> stringSequence(String target){
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        char currentChar = 'a';

        for (int i = 0; i < target.length(); i++) {

            while (current.length() <= i) {
                current.append('a');
                ans.add(current.toString());
            }

            while (current.charAt(i) != target.charAt(i)) {
                current.setCharAt(i, (char)(current.charAt(i) + 1));
                ans.add(current.toString());
            }
        }

        return ans;
    }
}
