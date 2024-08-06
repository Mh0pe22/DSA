package Array;

public class RemoveKDigits {

    public static void main(String[] args) {

        System.out.println(removeKDigit("1234" , 2));
    }

    static String removeKDigit(String digit, int k) {
        // Base case: if k is 0 or digit is empty, return digit
        if (k == 0 || digit.length() == 0) {
            return digit;
        }

        // Base case: if k is greater than or equal to the length of digit, return "0"
        if (k >= digit.length()) {
            return "0";
        }

        // Find the index of the first digit that is greater than the next digit
        int index = 0;
        while (index < digit.length() - 1 && digit.charAt(index) <= digit.charAt(index + 1)) {
            index++;
        }

        // Remove the digit at index and decrease k by 1
        String newDigit = digit.substring(0, index) + digit.substring(index + 1);

        // Remove leading zeroes from newDigit
        int i = 0;
        while (i < newDigit.length() && newDigit.charAt(i) == '0') {
            i++;
        }
        newDigit = newDigit.substring(i);

        return removeKDigit(newDigit, k - 1);
    }

}
