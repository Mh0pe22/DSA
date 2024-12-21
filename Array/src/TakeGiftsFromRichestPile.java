import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TakeGiftsFromRichestPile {
    public static void main(String[] args) {

    }

    public static long pickGits(int[] gifts , int k){
        List<Integer> gift = new ArrayList<>();

        for(int i : gifts){
            gift.add(-i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(gift);
        while(k-- > 0){
            int maxElement = -pq.poll();

            pq.offer(-(int)Math.sqrt(maxElement));
        }

        long numberOfRemainingGifts = 0;
        while(!pq.isEmpty()){
            numberOfRemainingGifts -= pq.poll();
        }

        return numberOfRemainingGifts;
    }
}
