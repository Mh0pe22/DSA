public class RemoveAllOccurrencesOfSubString {
    public static void main(String[] args) {
        String s = "abbbabcdabc";
        String part = "ab";
        System.out.println(removeOccurrences(s , part));
    }

    public static String removeOccurrences(String s , String part){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            sb.append(s.charAt(i));
            if(sb.length() >= part.length()){
                if(sb.substring(sb.length() - part.length()).equals(part)){
                    sb.delete(sb.length() - part.length() , sb.length());
                }
            }
        }

        return sb.toString();
    }
}
