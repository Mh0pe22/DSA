import java.util.Arrays;

public class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        System.out.println(Arrays.toString(divideString(s , k , fill)));
    }

    public static String[] divideString(String s , int k ,char fill){
        StringBuilder sb = new StringBuilder(s);

        int remainder = s.length() % k;
        if (remainder != 0) {
            int filling = k - remainder;
            while (filling-- > 0) {
                sb.append(fill);
            }
        }

        int n = sb.length();
        String[] ans = new String[n / k];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = sb.substring(i * k, (i + 1) * k);
        }

        return ans;
    }
}
