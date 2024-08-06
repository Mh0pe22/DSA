public class ScoreOfString {
    public static void main(String[] args) {

        String s ="zaz";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s){
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int a = s.charAt(i - 1) - 'a';
            sum += Math.abs(s.charAt(i -1) - s.charAt(i));
        }

        return sum;
    }
}
