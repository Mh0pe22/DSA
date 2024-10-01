public class MinimumNonZeroProductOfArrayElement {
    public static void main(String[] args) {
        int p =3;
        System.out.println(minNonZeroProduct(p));
    }

    public static int MOD = 1_000_000_007;
    public static int minNonZeroProduct(int p){
        if(p == 1){
            return 1;
        }
        long value = (1L << p) - 1; // Calculate 2^p - 1
        return (int) ((value % MOD * power(value - 1 , value / 2) % MOD) % MOD);
    }

    public static int power(long a , long b){
        int res = 1;
        a = a % MOD;
        if(a == 0){
            return 0;
        }

        while (b > 0) {
            // If b is odd, multiply res with a
            if ((b & 1) == 1) {
                res = (int) ((res * a) % MOD);
            }

            // Divide b by 2 and square the base
            b = b >> 1; // Same as b / 2
            a = (a * a) % MOD;
        }
        return res;
    }
}
