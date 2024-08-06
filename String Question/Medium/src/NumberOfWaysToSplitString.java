package Medium.src;

public class NumberOfWaysToSplitString {
    public static void main(String[] args) {
        String s = "0000";
        System.out.println(numWays(s));
    }

    public static int numWays(String s){
        long ones  = 0;
        long len = s.length();
        long MOD = 1_000_000_007;

        for (char c : s.toCharArray()){
            ones += c - '0';
        }

        if(ones == 0){
            return (int)((((len - 1) * (len - 2)) / 2) % MOD);
        }

        if(ones % 3 != 0){
            return 0;
        }

        long oneThird  = ones / 3;
        long way1  = 0;
        long way2 = 0;
        ones = 0;
        for (char c : s.toCharArray()){
            ones += c - '0';

            if(ones == oneThird){
                way1++;
            }

            if(ones == 2 * oneThird){
                way2++;
            }
        }
        return (int)((way1 * way2) % MOD);
    }
}
