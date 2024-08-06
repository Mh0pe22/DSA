import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        String s =  "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s){
        String[] arr = s.split(" ");

        String[] ans = new String[arr.length];

        for(String i : arr){
            int index = Integer.parseInt(i.substring(i.length() - 1));

            ans[index - 1] = i.substring(0, i.length() - 1);
        }

        return String.join(" ",ans);
    }
}
