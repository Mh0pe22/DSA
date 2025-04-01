import java.util.Arrays;

public class SolvingQuestionWithBrainPower {
    public static void main(String[] args) {
            int[][] questions = {
                    {3 ,2},
                    {4, 3},
                    {4 , 4},
                    {2, 5}
            };
        System.out.println(mostPoints(questions));
    }

//    public static long mostPoints(int[][] questions){
//        int n = questions.length;
//        if(n == 1){
//            return questions[0][0];
//        }
//
//        long[] t = new long[2000001];
//        for (int i = n - 1; i >= 0 ; i--) {
//            t[i] = Math.max(questions[i][0] + t[i + 1 + questions[i][1]] , t[i + 1]);
//        }
//        return t[0];
//    }

    public static long mostPoints(int[][] questions){

        int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp , -1);
        return solve(0 , questions , dp , n);
    }

    public static long solve(int i , int[][] questions , long[] dp , int n){

        if( i>= n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        long take = questions[i][0] + solve(i + questions[i][1] + 1 , questions , dp, n );
        long not_take = solve(i + 1 , questions , dp, n);

        return dp[i]=Math.max(take , not_take);
    }
}
