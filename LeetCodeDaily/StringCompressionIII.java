public class StringCompressionIII {
    public static void main(String[] args) {
            String s = "aaaaaaaaaaaaaaabb";
        System.out.println(compressedString(s));
    }

    public static String compressedString(String word){
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 1;

            while (i + count < word.length() && word.charAt(i + count) == currentChar && count < 9) {
                count++;
            }

            sb.append(count);
            sb.append(currentChar);
            i += count;
        }

        return sb.toString();
    }
}
