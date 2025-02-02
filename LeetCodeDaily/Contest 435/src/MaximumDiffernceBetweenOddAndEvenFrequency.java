import java.util.HashMap;
import java.util.Map;

public class MaximumDiffernceBetweenOddAndEvenFrequency {
    public static void main(String[] args) {
        String s = "aaaaabbc";
        System.out.println(maxDifference(s));
    }

    public static int maxDifference(String s){
        Map<Character , Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(freq.containsKey(s.charAt(i))){
                freq.put(ch , freq.get(ch) + 1);
            }else {
                freq.put(ch , 1);
            }
        }

        int odd = 0;
        int even = Integer.MAX_VALUE;
        for(int i : freq.values()){
            if(i % 2 ==0){
                even = Math.min(even , i);
            }else {
                odd = Math.max(odd , i);
            }
        }

        return odd - even;
    }
}
