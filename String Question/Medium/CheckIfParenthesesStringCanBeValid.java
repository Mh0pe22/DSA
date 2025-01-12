package Medium;

public class CheckIfParenthesesStringCanBeValid {
    public static void main(String[] args) {
        String s = "))(()))";
        String locked = "010100";
        System.out.println(canBeValid(s , locked));
    }

    public static boolean canBeValid(String s , String locked){
        if(s.length() % 2 != 0){
            return false;
        }

        int wildcard = 0;
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {

            if(locked.charAt(i) == '0'){
                wildcard++;
            }else if(s.charAt(i) == '('){
                open++;
            }else {
                close++;
            }



            if(wildcard < close - open){
                return false;
            }
        }

        wildcard = open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if(locked.charAt(i) == '0'){
                wildcard++;
            }else if(s.charAt(i) == '('){
                open++;
            }else {
                close++;
            }

            if(wildcard < open - close){
                return false;
            }
        }

        return true;
    }
}
