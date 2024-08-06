public class DecryptString {
    public static void main(String[] args) {

       String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

//    You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
//
//    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//            Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

    public static String freqAlphabets(String s){
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#'){
               String temp= s.substring(i -2, i);
               int n = Integer.parseInt(temp);

               char ch= (char)('a' + n - 1);
               ans.append(ch);

               i -= 2;
            }else{
                int n = s.charAt(i) - '0';
                char ch = (char)('a' + n - 1);
                ans.append(ch);
            }
        }
        ans.reverse();
        return ans.toString();
    }
}
