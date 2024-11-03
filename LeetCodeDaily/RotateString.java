public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s , goal));
    }

    public static boolean rotateString(String s, String goal){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(!sb.toString().equals(goal)){
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);
            }else{
                break;
            }
        }

        return sb.toString().equals(goal);
    }
}
