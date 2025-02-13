import java.util.PriorityQueue;

public class MinimumOperationToExceedThresholdValue2 {
    public static void main(String[] args) {
        int[] nums = {2,11,10,3};
        int k =10;
        System.out.println(minOperation(nums , k));
    }

    public static int minOperation(int[] nums , int k){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add((long)num);
        }
        int count = 0;
        while(!pq.isEmpty() && pq.peek() < k){
            long firstSmallest = pq.poll();

            long secondSmallest = pq.poll();

            long operation = Math.min(firstSmallest , secondSmallest) * 2 + Math.max(firstSmallest , secondSmallest);

            pq.add(operation);
            count++;
        }
        return count;
    }
}
