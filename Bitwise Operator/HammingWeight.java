public class HammingWeight {

    public static void main(String[] args) {
        int n =128;
        System.out.println(n);
    }

    static int digit(int n){

        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
