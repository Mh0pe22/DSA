public class VowelsGameInAString {
    public static void main(String[] args) {
        String s = "leetcoder";
        System.out.println(doesAliceWin(s));
    }

    public static boolean doesAliceWin(String s){

        int vowels = 0;
        for(char ch  : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }

            if(vowels > 0){
                return true;
            }
        }

        return false;

    }
}
