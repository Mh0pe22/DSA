public class Digit {

    public static void main(String[] args) {
        digit(5);
    }

    static void digit(int n){

        if(n ==0)
            return;
        System.out.println(n);
        digit(--n);

    }
}
