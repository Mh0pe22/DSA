package Medium.src;

public class SplitTwoStringAndMakePalindrome {
    public static void main(String[] args) {
        String a = "ulacfd";
        String b = "jizalu";
        System.out.println(checkPalindromeFormation(a , b));
    }

    public static boolean checkPalindromeFormation(String a ,String b){
        return check(a, b) || check(b , a);
    }

    public static boolean check(String a , String b){
        int l = 0;
        int r = b.length() - 1;

        while (l <  r && a.charAt(l) == b.charAt(r)){
            l++;
            r--;
        }

        if(l >= r){
            return true;
        }

        return isPalindrome(a.substring(l , r + 1)) || isPalindrome(b.substring(l , r + 1));
    }

    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }

        return l >= r;
    }
}
