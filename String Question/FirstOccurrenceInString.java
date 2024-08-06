public class FirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "d";
        System.out.println(strstr(haystack , needle));
    }

    public static int strstr(String haystack , String needle){

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String ch = haystack.substring(i , needle.length() + i);
            if(ch.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
