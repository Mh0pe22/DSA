public class Maximum69Number {
    public static void main(String[] args) {
        int num = 96996;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num){
        StringBuilder s = new StringBuilder(Integer.toString(num));
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '6'){
                s.setCharAt(i , '9');
                break;
            }
        }

        return Integer.parseInt(s.toString());
    }
}
