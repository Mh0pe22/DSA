public class ReorderedPowerOf2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(reorderedPowerOf2(n));
    }

    public static int numberFormat(int n){
        int number = 0;

        while (n > 0){
            number += (int)Math.pow(10 , n%10);
            n /= 10;
        }

        return number;
    }
    public static boolean reorderedPowerOf2(int n){

        int input = numberFormat(n);

        for (int i = 0; i <= 29 ; i++) {
            if(input == numberFormat(1 << i))
                    return true;
        }

        return false;
    }
}
