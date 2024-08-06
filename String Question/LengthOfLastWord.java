public class LengthOfLastWord {
    public static void main(String[] args) {
//        String s = "luffy is still joyboy";
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
//        String[] arr = s.split(" ");
//
//        return arr[arr.length - 1].length();

        int i = s.length() - 1;
        while (s.charAt(i) != ' '){
            i--;
        }

        return s.length() - i - 1;
    }
}
