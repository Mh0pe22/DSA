public class CountTheNumberOfArraysWithKMatchingAdjacentElement {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int k = 1;
        System.out.println(countGoodArrays(n , m ,k));
    }

    public static final int MOD = (int)1e9 + 7;

    public static long power (long a , long b){
        long result = 1;
        a %= MOD;
        while(b > 0){
            if((b & 1) == 1){
                result = (result * a ) % MOD;
            }
            a = (a * a) % MOD;
            b >>= 1;
        }
        return result;
    }

    // nCr % MOD using precomputed factorials and Fermat's inverse
    public static long nCr(int n , int r , long[] fact , long[] invFact){
        return fact[n] * invFact[n - r] % MOD * invFact[r] % MOD;
    }
    public static int countGoodArrays(int n , int m , int k){
        long[] fact = new long[n + 1];
        long[] invFact = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n ; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        // Compute inverse factorials using Fermat's Theorem
        for (int i = 0; i <= n; i++) {
            invFact[i] = power(fact[i], MOD - 2);
        }

        long result = nCr(n - 1 , k , fact , invFact);
        result = result * m % MOD;
        result = result * power(m - 1, n - k - 1) % MOD;

        return (int) result;
    }
}
