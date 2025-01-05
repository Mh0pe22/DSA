public class SubStringMatchingPattern {
    public static void main(String[] args) {
        String s = "nrnrs";
        String p = "*nn";

        System.out.println(hasMatch(s , p));
    }


    public static boolean hasMatch(String s, String p) {

        int j = 0;
        int i = 0;
        while(i < s.length() && j < p.length()){
            if(p.charAt(j) == '*'){
                j++;
                break;
            }else if(s.charAt(i) == p.charAt(j)){
                j++;
                i++;
            }else {
                i++;
            }
        }

        if(i > s.length() && j < p.length()){
            return false;
        }

        if(j < p.length() && p.charAt(j) == '*'){
            j++;
        }

        if(j == p.length()){
            return true;
        }

        while(i < s.length() && j < p.length()){
            if(s.charAt(i) == p.charAt(j)){
                j++;
            }
            i++;
        }

        return j == p.length();
    }
}
