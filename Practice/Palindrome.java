public class Palindrome {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isPalindrome(s , 0 , s.length() - 1));
    }

    public static boolean isPalindrome(String s, int i , int j){
        if(i > j){
            return true;
        }
        if(s.charAt(i) == s.charAt(j)){
            return isPalindrome(s , ++i , --j);
        }

        return false;
    }
}
