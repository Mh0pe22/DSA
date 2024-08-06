package Medium;

public class FindKthBit {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        System.out.println(findKthBit(n , k));
    }

    public static char  findKthBit(int n, int k){

//        String[] arr = new String[20];
//        arr[0] = "0";
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i-  1] + '1' + invert(arr[i - 1]);
//        }
//
//        return arr[n - 1].charAt( k - 1);

        if (n == 1) {
            return '0';  // Base case: the first sequence is just "0"
        }

        int length = (1 << n) - 1;  // Length of the nth sequence is 2^n - 1
        int mid = length / 2 + 1;   // Middle position in the sequence

        if (k == mid) {
            return '1';  // The middle element is always '1'
        } else if (k < mid) {
            return findKthBit(n - 1, k);  // The first half is the same as the previous sequence
        } else {
            // The second half is the inverted reverse of the previous sequence
            return invert(findKthBit(n - 1, length - k + 1));
        }
    }

    public static char invert(char c) {
        return c == '0' ? '1' : '0';  // Invert '0' to '1' and '1' to '0'
    }
    public static String inverted(String s){

//        reverse s and change '1' to '0' or '0' to '1'
        StringBuilder in = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                in.append('1');
            }else {
                in.append('0');
            }
        }

        return in.toString();
    }
}
