public class SpecialNumber {

    public static void main(String[] args) {
        int l =5;
        int r = 7;
        System.out.println(nonSpecialCount(l,r));
    }
    public static int nonSpecialCount(int l, int r) {
        int count = (r - l) + 1;
        int c = 0;
        for(int i = l; i <= r; i++){
            boolean a = isPrime(i);
            if (isPrime(i)) {
                int square = i * i;
                if (square >= l && square <= r) {
                    c++;
                }
            }
        }
        return count - c;
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        int c  =2;
        while(c * c <= n){
            if( n% c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
