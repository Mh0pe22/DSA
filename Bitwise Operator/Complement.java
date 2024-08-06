public class Complement {

    public static void main(String[] args) {

        int num = 2;
        System.out.println(complement2(num));
    }

    static int complement(int n) {

        int mask = (Integer.highestOneBit(n) << 1) - 1;
        n = ~n;
        return n & mask;
////        int[] arr= new int[digit(n)];
////        int i =0;
//        while (n > 0) {
//
//            n = n ^ 1;
//            n >>= 1;
//
//        }
//        return n;
    }

    static int complement2(int n) {
        int mask = n;
        int bit = 1;
        // Create a mask with all bits set to 1 up to the highest set bit in n
        while (mask != 0) {
            mask >>= 1;
            bit <<= 1;
        }
        // XOR n with the mask to flip all the bits
        return n ^ (bit - 1);
    }

}

//    static int digit(int n){
//
//        return (int)(Math.log(n) / Math.log(2)) + 1;
//    }
//}
