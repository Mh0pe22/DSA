public class ValidWord {
    public static void main(String[] args) {
        String word = "231Adas";
        System.out.println(isValid(word));
    }

    public static boolean isValid(String word){
        if(word.length() < 3){
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                continue;
            } else if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')) {
                vowel = true;
            } else if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z')){
                consonant = true;
            } else if ((word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U')) {
                vowel = true;
            } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                consonant = true;
            } else {
                return false;
            }
        }

        return vowel && consonant;
    }
}
