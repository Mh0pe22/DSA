public class MinimumNumberOfOperationToMakeStringSorted {
    public static void main(String[] args) {
        String s = "cba";
        System.out.println(makeStringSorted(s));
    }

    static long[] inv = new long[3001];
    static long[] fact = new long[3001];
    static long[] invfact = new long[3001];
    static int M = (int)1e9+7;
    public static int makeStringSorted(String s) {
        int[] count = new int[26]; // available to take
        fact[0]=invfact[0]=fact[1]=invfact[1]=inv[1]=1;
        for (int i = 2; i <= 3000; i++){
            inv[i] = M-M/i*inv[M%i]%M;
            fact[i] = fact[i-1]*i%M;
            invfact[i] = invfact[i-1]*inv[i]%M;
        }
        long ans = 0;
        for (int i = s.length()-1; i >= 0; i--){
            int k = s.charAt(i) - 'a', ttl = 0;
            count[k]++; // become available
            for (int j = 0; j < k; j++){
                ttl += count[j];
            }
            long cur = ttl * fact[s.length()-1-i] % M;
            for (int j = 0; j < 26; j++){
                cur *= invfact[count[j]];
                cur %= M;
            }
            ans += cur;
            ans %= M;
        }
        return (int)ans;
    }
}
