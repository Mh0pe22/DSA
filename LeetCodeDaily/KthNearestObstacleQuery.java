import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthNearestObstacleQuery {
    public static void main(String[] args) {
        int[][] arr = {
                {7,7},
                {-9 , 4}
        };

        int k = 2;
        System.out.println(Arrays.toString(resultArray(arr , k)));
    }

    public static int[] resultArray(int[][] queries ,int k){

//        int[] ans = new int[queries.length];
//        for(int i = 0; i < queries.length; i++){
//            int sum = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);
//            if(i + 1 < k){
//                ans[i] = -1;
//            }else {
//                ans[i] = sum;
//            }
//        }
//
//        return ans;

        int[] ans = new int[queries.length];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int distance = Math.abs(x) + Math.abs(y);

            maxHeap.offer(distance);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }

            if (maxHeap.size() < k) {
                ans[i] = -1;
            } else {
                ans[i] = maxHeap.peek();
            }
        }

        return ans;
    }
}
