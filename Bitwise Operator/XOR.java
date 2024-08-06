public class XOR {

    public static void main(String[] args) {
//         Xor form a to b is xor(b) - xor(a-1)

        int a = 4;
        int b = 11;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
    }

    static int xor(int n){
        if(n % 4 == 0){
            return n;
        }

        if( n % 4 == 1){
            return 1;
        }

        if(n % 4 == 2){
            return n +1;
        }

        return 0;
    }
}
