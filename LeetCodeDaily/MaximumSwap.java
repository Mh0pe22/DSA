public class MaximumSwap {
    public static void main(String[] args) {
        int num = 1993;
        System.out.println(maximumSwap(num));
    }

    public static int maximumSwap(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);
        int[] last = new int[10];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - '0'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            int currentDigit = s.charAt(i) - '0';

            for (int d = 9; d > currentDigit; d--) {
                if (last[d] > i) {
                    sb.setCharAt(i, (char)(d + '0'));
                    sb.setCharAt(last[d], (char)(currentDigit + '0'));
                    return Integer.parseInt(sb.toString());
                }
            }
        }

        return n;
    }
}
