public class MinimumArrayEnd {

    public static void main(String[] args) {
        int n = 3;
        int x = 4;
        System.out.println(minEnd(n, x));
    }

    public static long minEnd(int n, int x) {

        long ans = x;
        for (int i = 1; i < n ; i++) {
            ans = (ans + 1) | x;
        }

        return ans;
    }
}
