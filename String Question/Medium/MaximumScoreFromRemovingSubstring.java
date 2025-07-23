package Medium;

public class MaximumScoreFromRemovingSubstring {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        System.out.println(maximumGain(s, x, y));
    }

    public static int maximumGain(String s , int x , int y){
        int n = s.length();

        String max = x > y ? "ab" : "ba";
        String min;
        if(max.equals("ab")){
            min = "ba";
        }else{
            min = "ab";
        }

        String tempFirst = removeSubString(s , max);
        int L = tempFirst.length();
        int removePairedCount = (n - L) / 2;
        int score = removePairedCount * Math.max(x , y);

        String tempSecond = removeSubString(tempFirst , min);
        removePairedCount = (L - tempSecond.length()) / 2;
        score += removePairedCount * Math.min(x, y);

        return score;
    }

    public static String removeSubString(String inputString , String target){
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < inputString.length(); i++) {
            sb.append(inputString.charAt(i));
            j++;

            if(j > 1 && inputString.charAt(j - 1) == target.charAt(1) && inputString.charAt(j - 2) == target.charAt(0)){
                sb.delete(j - 2 , j);
                j -= 2;
            }
        }

        return sb.toString();
    }
}
