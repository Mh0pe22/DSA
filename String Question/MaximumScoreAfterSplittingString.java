public class MaximumScoreAfterSplittingString {
    public static void main(String[] args) {
        String s = "00111";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s){
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                one++;
            }
        }

        int score = Integer.MIN_VALUE;
        int zero = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '1'){
                one--;
            }else {
                zero++;
            }
            score =Math.max(score , zero + one);

        }
        return score;
    }
}
