package Medium.src;

public class NextGreaterElement3 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(nextGreaterElement(n));
    }

    public static int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int i = digits.length - 2;

        // Step 1: Find the pivot
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no pivot is found, return -1 (the number is in descending order)
        if (i == -1) {
            return -1;
        }

        // Step 2: Find the smallest digit larger than the pivot
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap the pivot with this digit
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the digits after the pivot
        reverse(digits, i + 1, digits.length - 1);

        // Step 5: Convert the array back to a number and check if it fits in 32-bit
        try {
            long result = Long.parseLong(new String(digits));
            return (result <= Integer.MAX_VALUE) ? (int) result : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
