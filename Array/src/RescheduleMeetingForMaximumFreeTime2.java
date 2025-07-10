import java.util.ArrayList;
import java.util.List;

public class RescheduleMeetingForMaximumFreeTime2 {
    public static void main(String[] args) {
        int eventTime = 5;
        int[] startTime = {1, 3};
        int[] endTime = {2 , 5};
        System.out.println(maxFreeTime(eventTime , startTime, endTime));
    }

    public static int maxFreeTime(int eventTime , int[] startTime , int[] endTime){
        int n = startTime.length;
        int[] freeArray = new int[n + 1];
        freeArray[0] = startTime[0];
        for (int i = 1; i < n; i++) {
            freeArray[i] = startTime[i] - endTime[i - 1];
        }
        freeArray[n] = eventTime - endTime[n - 1];

        int m = freeArray.length;
        int[] maxRightFree = new int[m];
        int[] maxLeftFree = new int[m];

        for (int i = m - 2; i >= 0 ; i--) {
            maxRightFree[i]  = Math.max(maxRightFree[i + 1] , freeArray[i + 1]);
        }

        for (int i = 1; i < m; i++) {
            maxLeftFree[i] = Math.max(maxLeftFree[i - 1] , freeArray[i - 1]);
        }

        int result = 0;
        for (int i = 1; i < m; i++) {
            int currentTime = endTime[i - 1] - startTime[i - 1];

            if(currentTime <= Math.max(maxLeftFree[i - 1] , maxRightFree[i])){
                result = Math.max(result , freeArray[i - 1] + currentTime + freeArray[i]);
            }

            result = Math.max(result , freeArray[i - 1] + freeArray[i]);
        }

        return result;
    }
}
