public class Digits {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(numberOfDigit(num));
    }

    public static int numberOfDigit(int num){
        return (int)Math.log10(num) + 1;
    }
}
