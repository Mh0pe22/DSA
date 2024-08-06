package Medium.src;

public class SubStringWith1 {
    public static void main(String[] args) {
        String s = "111111";
        System.out.println(numSub(s));
    }

    public static int numSub(String s){
        int res = 0;
        int count = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < s.length(); i++) {
            count = s.charAt(i) == '1' ? count + 1 : 0;
            res = (res + count) % mod;
        }
        return res;
    }
}
