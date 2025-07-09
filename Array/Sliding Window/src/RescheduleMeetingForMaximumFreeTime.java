import java.util.ArrayList;
import java.util.List;

public class RescheduleMeetingForMaximumFreeTime {
    public static void main(String[] args) {
        int eventTime = 5;
        int k = 1;
        int[] startTime = {1 , 3};
        int[] endTime = {2, 5};

        System.out.println(maxTime(eventTime , k , startTime , endTime));
    }

    public static int maxTime(int eventTime , int k , int[] startTime , int[] endTime){
        List<Integer> freeArray = new ArrayList<>();

        freeArray.add(startTime[0]);
        for (int i = 1; i < startTime.length; i++) {
            freeArray.add(startTime[i] - endTime[i - 1]);
        }

        freeArray.add(eventTime - endTime[endTime.length - 1]);

        int i = 0;
        int j = 0;
        int maxSum = 0;
        int currSum = 0;
        int n = freeArray.size();

        while(j < n){
            currSum  += freeArray.get(i);

            if(i < n && j - i + 1 > k + 1){
                currSum -= freeArray.get(j);
                i++;
            }

            maxSum = Math.max(maxSum , currSum);
            j++;
        }

        return maxSum;
    }
}
