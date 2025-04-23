import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountLargestGroup {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }

    public static int countLargestGroup(int n){

        if(n < 10){
            return n;
        }

        HashMap<Integer , Integer> mp = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = String.valueOf(i).chars().map(c -> c - '0').sum();
            mp.put(sum , mp.getOrDefault(sum , 0) + 1);
        }

        int maxGroupSize = 0;
        for(int groupSize : mp.values()){
            maxGroupSize = Math.max(maxGroupSize , groupSize);
        }

        int result = 0;
        for(int group : mp.values()){
            if (maxGroupSize == group){
                result++;
            }
        }
        return result;
    }
}
