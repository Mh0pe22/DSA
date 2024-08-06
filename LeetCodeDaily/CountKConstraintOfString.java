public class CountKConstraintOfString {

    public static void main(String[] args) {
        String s1 = "10101";
        int k1 = 1;
        System.out.println("Output: " + countSubstrings(s1, k1));
    }
    public static int countSubstrings(String s, int k) {
        return countValidSubstrings(s, k);
    }

    private static int countValidSubstrings(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        int count0 = 0, count1 = 0;

        for (int right = 0; right < n; right++) {
            // Expand the window
            if (s.charAt(right) == '0') {
                count0++;
            } else {
                count1++;
            }

            // Shrink the window until the condition is satisfied
            while (count0 > k && count1 > k) {
                if (s.charAt(left) == '0') {
                    count0--;
                } else {
                    count1--;
                }
                left++;
            }

            // All substrings ending at 'right' are valid from 'left' to 'right'
            count += (right - left + 1);
        }

        return count;

    }
}
