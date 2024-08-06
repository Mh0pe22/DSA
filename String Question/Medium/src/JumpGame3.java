package Medium.src;

public class JumpGame3 {
    public static void main(String[] args) {
        String s = "0110110";
        int minJump = 2;
        int maxJump = 3;
        System.out.println(canReach(s , minJump , maxJump));
    }

    public static boolean canReach(String s , int minJump , int maxJump){
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;
        int maxReach = 0;

        for (int i = 1; i < n; i++) {
            if (i >= minJump && dp[i - minJump]) {
                maxReach++;
            }
            if (i > maxJump && dp[i - maxJump - 1]) {
                maxReach--;
            }
            dp[i] = maxReach > 0 && s.charAt(i) == '0';
        }

        return dp[n - 1];
    }
}
