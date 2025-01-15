public class MinimizeXOR {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        System.out.println(minimizeXor(num1 , num2));
    }

    private static boolean isSet(int x , int bit){
        return (x & (1 << bit) ) != 0;
    }
    private static boolean isUnSet(int x ,int bit){
        return (x & (1 << bit)) == 0;
    }
    public static int minimizeXor(int num1 , int num2){

        int x = 0;
        int requiredSetBit = Integer.bitCount(num2);

        for (int bit = 31; bit >= 0 && requiredSetBit > 0; bit--) {
            if(isSet(num1 , bit)){
                x |= (1 << bit);
                requiredSetBit--;
            }
        }

        for (int bit = 0; bit < 31 && requiredSetBit > 0; bit++) {
            if(isUnSet(num1 , bit)){
                x |= (1 << bit);
                requiredSetBit--;
            }
        }

        return x;
    }
}
