import java.util.HashMap;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s = "lEetcOde";

        System.out.println(sortVowels(s));
    }

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static String sortVowels(String s){

        HashMap<Character , Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                freq.put(ch , freq.getOrDefault(ch , 0) + 1);
            }
        }

        String temp = "AEIOUaeiou";
        int j =  0;

        char[] resultArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if(isVowel(s.charAt(i))){
                while(freq.getOrDefault(temp.charAt(j) , 0) == 0){
                    j++;
                }
                resultArray[i] = temp.charAt(j);
                freq.put(temp.charAt(j) , freq.get(temp.charAt(j)) - 1);
            }

        }

        return new String(resultArray);
    }
}
