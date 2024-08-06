public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"a"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs){

        if(strs.length == 1){
            return strs[0];
        }

        String ans = "";
        int min = strs[0].length();
        for (String s: strs){
            if(s.length() < min){
                min = s.length();
            }
        }
        for (int i = 0; i < min; i++) {
            String sub = strs[0].substring(0,i + 1);
            for (int j = 1; j < strs.length; j++) {
                if(!sub.equals(strs[j].substring(0, i + 1))){
                    break;
                }

                if(j == strs.length - 1){
                    ans = sub;
                }
            }
        }
        return ans;
    }
}
