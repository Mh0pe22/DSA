public class MinimumOperationsToMakeTheIntegerZero {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(makeTheIntegerZer(num1 , num2));
    }

    public static int makeTheIntegerZer(int num1 , int num2){
        for (long i = 1; i <= 60 ; i++) {
            long target = (long) (num1 - (i * num2));
            if(target < i){
                break;
            }
            long setBits = Long.bitCount(target);
            if(setBits <= i){
                return (int)i;
            }
        }

        return -1;
    }
}
