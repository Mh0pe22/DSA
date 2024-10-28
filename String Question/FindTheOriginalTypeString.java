public class FindTheOriginalTypeString {
    public static void main(String[] args) {
        String s = "abbcccc";
        System.out.println(possibleStringCount(s));
    }

    public static int possibleStringCount(String word){
        char[] ch = word.toCharArray();
        int count = 0;
        for (int i = 1; i < ch.length ; i++) {
            if(ch[i - 1] == ch[i]){
                count++;
            }
        }

        return count + 1;
    }
}
