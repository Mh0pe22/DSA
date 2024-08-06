public class CheckOneSegment {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(checkOneSegment(s));
    }

    public static boolean checkOneSegment(String s){

//        if(s.length() == 1){
//            return false;
//        }
//
//        int count = 0;
//        int j = s.length() - 1;
//        for (int i = 0; i < s.length() / 2; i++) {
//            if(s.charAt(i) == '1' && s.charAt(i + 1) == '1'){
//                return true;
//            }
//
//            if(s.charAt(j) == '1' && s.charAt(j - 1) == '1'){
//                return true;
//            }
//            j--;
//        }
//
//        return false;

        int count = 0;
        boolean inSegment = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            } else {
                inSegment = false;
            }
        }

        return count <= 1;
    }
}
