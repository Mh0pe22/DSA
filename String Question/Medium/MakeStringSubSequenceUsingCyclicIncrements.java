package Medium;

public class MakeStringSubSequenceUsingCyclicIncrements {
    public static void main(String[] args) {

        String s1 = "zc";
        String s2 = "ad";

        System.out.println(cnaMakeStringSubSequence(s1 ,s2));
    }

    public static boolean cnaMakeStringSubSequence(String s1 , String s2){
        int i = 0;
        int j = 0;

        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            } else{

                char ch = (char) ((s1.charAt(i) - 'a' + 1) % 26 + 'a');

                if(ch == s2.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
        }

        return s2.length() == j;
    }
}
