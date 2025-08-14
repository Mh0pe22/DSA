public class Largest3NumberInDigits {
    public static void main(String[] args) {
        String num = "4818042931906802860005960222213336669500011846936171709111";
        System.out.println(LargestGoodInteger(num));
    }

    public static String LargestGoodInteger(String num){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length() - 2; i++) {
            char ch = num.charAt(i);
            boolean equal = (ch == num.charAt(i + 1)) && (ch == num.charAt(i + 2));

            if(equal){
                max = Math.max(max , (int)(ch - '0'));
                i += 2;
            }
        }

        return max > 0 ? Integer.toString(max) + Integer.toString(max) + Integer.toString(max) : "";
    }
}
