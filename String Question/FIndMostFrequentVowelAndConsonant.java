import java.util.HashMap;

public class FIndMostFrequentVowelAndConsonant {
    public static void main(String[] args) {
        String s ="successes";
        System.out.println(maxFreqSum(s));
    }

    public static int maxFreqSum(String s){

        if(s.length() == 1 ){
            return 1;
        }

        HashMap<Character , Integer> consonant= new HashMap<>();
        HashMap<Character , Integer> vowels = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels.put(ch , vowels.getOrDefault(ch , 0) + 1);
            }else{
                consonant.put(ch ,  consonant.getOrDefault(ch , 0) + 1);
            }
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        for(Integer i : consonant.values()){
            maxConsonant = Math.max(maxConsonant , i);
        }

        for(Integer i : vowels.values()){
            maxVowel = Math.max(maxVowel , i);
        }

        return maxConsonant + maxVowel;
    }
}
