public class CircularSentence {
    public static void main(String[] args) {
        String s = "Leetcode is cool";
        System.out.println(isCircularSentence(s));
    }

    public static boolean isCircularSentence(String sentence){
        String[] sen = sentence.split(" ");

        for (int i = 0; i < sen.length; i++) {
            if(i == sen.length - 1){
                return sen[0].charAt(0) == sen[i].charAt(sen[i].length() - 1);
            }
            if(sen[i].charAt(sen[i].length() - 1) == sen[i + 1].charAt(0)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
