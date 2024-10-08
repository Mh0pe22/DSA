import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }

    public static int romanToInteger(String s){
        Map<Character , Integer> map= new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int ans= 0;
        for (int i = 0; i < s.length(); i++) {
            if(i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
              ans -= map.get(s.charAt(i));
            }else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
