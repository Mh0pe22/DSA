import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class CountRabbits {
    public static void main(String[] args) {
        int[] answers = {1 ,1, 2};
        System.out.println(numRabbits(answers));
    }

    public static int numRabbits(int[] answers){
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : answers){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        int total = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int x = entry.getKey();
            int count = entry.getValue();

            int groupSize = x + 1;
            int groups = (int) Math.ceil((double) count / groupSize);

            total += groups * groupSize;
        }

        return total;
    }
}
