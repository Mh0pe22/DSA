public class LargestPalindromeDivideByK {
    public static void main(String[] args) {
        int n = 15;
        int k = 2;
        System.out.println("Output: " + largestKPalindromic(n, k));
    }

    public static String largestKPalindromic(int n, int k) {
        int halfLength = (n + 1) / 2;

        // Start with the largest number with halfLength digits
        long maxHalf = (long)Math.pow(10, halfLength) - 1;

        // Iterate over possible values of the half in descending order
        for (long half = maxHalf; half >= 0; half--) {
            // Generate the full palindrome
            String halfStr = Long.toString(half);
            String palindromeStr = generatePalindrome(halfStr, n);

            // Convert palindrome string to number
            long palindrome = Long.parseLong(palindromeStr);

            // Check divisibility by k
            if (palindrome % k == 0) {
                return palindromeStr;
            }
        }

        return "";  // Return empty if no such palindrome exists
    }

    private static String generatePalindrome(String halfStr, int n) {
        StringBuilder sb = new StringBuilder(halfStr);
        // If n is odd, we need to exclude the last digit of the half when mirroring
        if (n % 2 == 0) {
            return halfStr + sb.reverse().toString();
        } else {
            return halfStr + sb.reverse().substring(1);
        }
    }

}
