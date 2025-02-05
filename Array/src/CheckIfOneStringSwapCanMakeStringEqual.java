import java.util.ArrayList;
import java.util.List;

public class CheckIfOneStringSwapCanMakeStringEqual {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1 , s2));
    }

    public static boolean areAlmostEqual(String s1 ,String s2){

        if(s1.equals(s2)){
            return true;
        }

        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                li.add(i);
            }
            if(li.size() > 2){
                return false;
            }
        }

        return li.size() == 2 &&
                s1.charAt(li.get(0)) == s2.charAt(li.get(1)) &&
                s1.charAt(li.get(1)) == s2.charAt(li.get(0));

    }
}
