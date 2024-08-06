public class AddBinary {

    public static void main(String[] args) {

        String a ="10001";
        String b= "11010";
        System.out.println(addBinary(a,b));

    }
//    static String addBinary(String a, String b) {
//       int a1 = Integer.parseInt(a , 2);
//       int a2 = Integer.parseInt(b ,2);
//       return Integer.toBinaryString(a1+a2);
//    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.insert(0, carry % 2);
            carry /= 2;
        }

        return sb.toString();
    }
}

