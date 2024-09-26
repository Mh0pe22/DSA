public class GoodCountNumbers {

//    For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
    public static void main(String[] args) {
        int n = 50;
        System.out.println(countGoodNumbers(n));

    }

    static long  MOD = 1_000_000_007;
    public static int countGoodNumbers(long n){

        long even = (n + 1) / 2;
        long odd = n / 2;
        long first = pow(5 , even) % MOD;
        long second = pow(4 , odd) % MOD;

        return (int)(( first * second )% MOD);
    }

    public static long pow(long base , long power){

        if(power == 0){
            return 1;
        }

        long temp = pow(base , power/2);

        if(power % 2 == 0){
            return (temp * temp)%MOD;
        }else{
            return (base * temp * temp)%MOD;
        }
    }
}
