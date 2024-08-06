package Medium.src;

public class CountHomogenousSubStrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }

    public static int countHomogenous(String s){
        int count = 0;
        int res = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count += 1;
            } else {
                count = 1;
            }

            res = (count + res) % MOD;
        }
        return res;
    }
}
