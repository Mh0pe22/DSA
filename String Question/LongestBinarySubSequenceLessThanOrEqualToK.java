public class LongestBinarySubSequenceLessThanOrEqualToK {
    public static void main(String[] args) {
        String s = "1001010";
        int k = 5;
        System.out.println(longestSubsequence(s , k));
    }

    public static int longestSubsequence(String s , int k){

        int n = s.length() - 1;
        int length = 0;
        int powerValue = 1;

        for (int i = n; i >= 0 ; i--) {
            if(s.charAt(i) == '0'){
                length++;
            } else if (powerValue <= k) {
                k -= powerValue;
                length++;
            }

            if(powerValue <= k){
                powerValue = (powerValue << 1);
            }
        }

        return length;
    }
}
