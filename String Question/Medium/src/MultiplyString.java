package Medium.src;

public class MultiplyString {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] ans = new int[num1.length() + num2.length()];
        StringBuilder n1 = new StringBuilder(num1);
        StringBuilder n2 = new StringBuilder(num2);

        n1.reverse();
        n2.reverse();

        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                int mul = (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
                ans[i + j] += mul;
                ans[i + j + 1] += ans[i + j] / 10;
                ans[i + j] %= 10;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int k = ans.length - 1; k >= 0; k--) {
            if (result.isEmpty() && ans[k] == 0)
                continue;
            result.append(ans[k]);
        }

        return result.toString();
    }
}
