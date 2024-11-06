package Medium.src;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberOfChangeToMakeBinaryStringBeautiful {
    public static void main(String[] args) {
        String s = "1100110011001100";
        System.out.println(minChanges(s));
    }

    public static int minChanges(String s){

        int count = 0;
        int change = 0;

        char ch = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch){
                count++;
                continue;
            }

            if(count % 2 == 0){
                count = 1;
            }else{
                change++;
                count = 0;
            }

            ch = s.charAt(i);
        }

        return change;
    }
}
