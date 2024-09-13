package Medium.src;

import java.util.ArrayList;
import java.util.List;

public class PrintWordVertically {
    public static void main(String[] args) {
        String s = "How Are Yo";
        List<String > ans = printVertically(s);
        for(String i : ans){
            System.out.println(i);
        }
    }

    public static List<String> printVertically(String s){
        String[] arr = s.split(" ");

        int max = 0;
        for(String i : arr){
            if(i.length() > max){
                max = i.length();
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            StringBuilder temp = new StringBuilder();
            for(String j : arr){
                if(i >= j.length()){
                    temp.append(" ");
                }else{
                    temp.append(j.charAt(i));
                }
            }
            ans.add(removeLastSpace(temp.toString()));
        }
        return ans;
    }

    public static String removeLastSpace(String s){
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        return s.substring(0 , i + 1);
    }
}
