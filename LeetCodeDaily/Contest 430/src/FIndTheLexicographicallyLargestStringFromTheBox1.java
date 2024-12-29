import java.util.Arrays;

public class FIndTheLexicographicallyLargestStringFromTheBox1 {
    public static void main(String[] args) {
        String s = "dbca";
        int friend = 2;
        System.out.println(answerString(s , friend));
    }

    public static String answerString(String word , int numFriends){
        int n = word.length();

        String[][] dp = new String[n + 1][numFriends + 1];

        for(String[] i : dp){
            Arrays.fill(i , "");
        }

        for (int i = 1; i <= numFriends; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = i - 1; k < j ; k++) {
                    String currentSplit = dp[k][i - 1] + word.substring(k , j);
                    dp[j][i] = max(dp[j][i] , currentSplit);
                }
            }
        }

        return dp[n][numFriends];
    }

    public static String max(String a , String b){
        return a.compareTo(b) > 0 ? a : b;
    }
}
