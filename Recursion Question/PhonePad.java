import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PhonePad {

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombination(digits));
    }

    public static String[] KEYPAD = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public static List<String> letterCombination(String digits){

        if(digits == null || digits.isEmpty()){
            return new ArrayList<>();
        }
        return phonePad("" , digits);
    }

    public static List<String> phonePad(String process , String unProcess){

        if(unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);

            return list;
        }

        int digit = unProcess.charAt(0) - '0';
        String letters = KEYPAD[digit];

        ArrayList<String> list = new ArrayList<>();

//        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
//            char ch = (char)('a' + i);
//            list.addAll(phonePad(process + ch , unProcess.substring(1)));
//        }

        for(char ch : letters.toCharArray()){
            list.addAll(phonePad(process + ch, unProcess.substring(1)));
        }

        return list;
    }
}
