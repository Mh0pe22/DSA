public class ReverseStringIII {
    public static void main(String[] args) {
        String s =  "Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }

    public static String reverseWord(String s){
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String i : arr){
            StringBuilder reverseWord = new StringBuilder(i);
            reverseWord.reverse();
            result.append(reverseWord).append(" ");
        }
        return result.toString().trim();
    }
}
