public class Fibbo {

    public static void main(String[] args) {
        System.out.println(fibboFormula(50));

//        System.out.println(recur(4));
    }

    static int fibboFormula(int n){


        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
    }

    static int recur(int n){

        if( n == 0){
            return n;
        }

        if( n == 1){
            return 1;
        }
         return recur(n-1) + recur(n-2);
    }
}
