public class ReverseBinary {

    public static void main(String[] args) {
        int n =  0b00000010100101000001111010011100;
        System.out.println(reverse(n));
    }

    static int reverse(int n) {

        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
        }
        return reversed;
    }
}
