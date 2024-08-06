package Medium.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwapAdjacentInLRString {
    public static void main(String[] args) {
        String  start = "LLX";
        String end = "RRX";
        System.out.println(canTransFrom(start , end));
    }

    public static boolean canTransFrom(String start , String end){
        List<Character> v1 = new ArrayList<>();
        List<Character> v2 = new ArrayList<>();

        List<Integer> m1  =new ArrayList<>();
        List<Integer> m2 = new ArrayList<>();

        for (int i = 0; i < start.length(); i++) {
            if(start.charAt(i) != 'X'){
                v1.add(start.charAt(i));
                m1.add(i);
            }

            if(end.charAt(i) != 'X'){
                v2.add(end.charAt(i));
                m2.add(i);
            }
        }

        if(v1.size() != v2.size()){
            return false;
        }

        for (int i = 0; i < v1.size(); i++) {
            if(v1.get(i) == 'L' && v2.get(i) == 'L'){
                if(m1.get(i) < m2.get(i)){
                    return false;
                }
            } else if (v1.get(i) == 'R' && v2.get(i) == 'R') {
                if(m1.get(i) > m2.get(i)){
                    return false;
                }
            }else {
                return false;
            }
        }

        return true;
    }
}
