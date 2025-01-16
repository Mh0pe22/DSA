public class BitwiseXorOfAllPairs {
    public static void main(String[] args) {
        int[] num1 = {2, 1, 3};
        int[] num2 = {10, 2, 5, 0};

        System.out.println(xorAllNums(num1 , num2));
    }

    public static int xorAllNums(int[] num1, int[] num2){
        int m = num1.length;
        int n = num2.length;

        int XOR = 0;

        if(m % 2 != 0){
            for(int num: num2){
                XOR ^= num;
            }
        }

        if(n % 2 != 0){
            for(int num: num1){
                XOR ^= num;
            }
        }

        return XOR;
    }
}
