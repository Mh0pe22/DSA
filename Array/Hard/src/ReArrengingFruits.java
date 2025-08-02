import java.util.*;

public class ReArrengingFruits {
    public static void main(String[] args) {
        int[] basket1 = {4 , 2 , 2,2 ,1};
        int[] basket2 = {4 , 2 , 3, 1 ,2};
        System.out.println(minCost(basket1 , basket2));
    }

    public static long minCost(int[] basket1 , int[] basket2){
        Map<Integer , Integer> m1 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int n : basket1){
            m1.put(n ,m1.getOrDefault(n ,0) + 1);
            min = Math.min(min , n);
        }
        for(int n : basket2){
            m1.put(n , m1.getOrDefault(n , 0) - 1);
            min = Math.min(min , n);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : m1.entrySet()){
            int val = entry.getValue();
            if(val % 2 != 0){
                return -1;
            }
            for (int i = 0; i < Math.abs(val) / 2; i++) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        long ans = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            ans += Math.min(list.get(i) , min * 2);
        }
        return ans;
    }
}
