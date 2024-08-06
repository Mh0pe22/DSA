public class CountOfGoodIntegers {
    public static void main(String[] args) {
            int n = 3;
            int k = 5;

        System.out.println(countGoodInteger(n , k));
    }

    public static long countGoodInteger(int n, int k){
        long ans = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('9');
        }

        long length = Integer.parseInt(sb.toString());
        for(long i = 1; i < length; i++){
            StringBuilder s = new StringBuilder(Integer.toString((int)i));
            s.reverse();
            long rev = Integer.parseInt(s.toString());

            if(rev == i && rev % k == 0){
                ans++;
            }
        }

        return ans;
    }
}
