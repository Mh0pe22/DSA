import java.util.Arrays;

public class OrderlyQueue {
    public static void main(String[] args) {
        String s = "zxabc";
        int k = 1;
        System.out.println(orderlyQueue(s , k));
    }

    public static String orderlyQueue(String s, int k){
        if (k == 1) {
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);

            // Try all rotations of the string
            for (int i = 0; i < s.length(); i++) {
                sb.append(sb.charAt(0));    // Move first character to the end
                sb.deleteCharAt(0);         // Delete the first character
                String rotated = sb.toString();
                if (rotated.compareTo(smallest) < 0) {
                    smallest = rotated;
                }
            }

            return smallest;
        } else {
            // If k > 1, sorting the string will give the lexicographically smallest result
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}
