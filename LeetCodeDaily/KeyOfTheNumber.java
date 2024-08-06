public class KeyOfTheNumber {
    public static void main(String[] args) {

    }

    public static int generateKet(int a , int b , int c){
        String s1 = String.format("%04d", a);
        String s2 = String.format("%04d", b);
        String s3 = String.format("%04d", c);


        StringBuilder key = new StringBuilder();


        for (int i = 0; i < 4; i++) {
            int digit1 = s1.charAt(i) - '0';
            int digit2 = s2.charAt(i) - '0';
            int digit3 = s3.charAt(i) - '0';

            int minDigit = Math.min(digit1, Math.min(digit2, digit3));
            key.append(minDigit);
        }


        return Integer.parseInt(key.toString());
    }


}
