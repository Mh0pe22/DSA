public class Pow {
    public static void main(String[] args) {

        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x , n));
    }

    public static double myPow(double x, int n){

        if(n == 0){
            return 1;
        }

        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }

        if(n < 0){
            x = 1 / x;
            n = -n;
        }

        if(n % 2 == 0){
            return myPow(x * x , n / 2);
        }else {
            return x * myPow(x * x , (n - 1 )/2);
        }
    }
}
