import java.util.HashMap;
import java.util.Map;

public class ButtonWithLongetPushTime {
    public static void main(String[] args) {

    }

    public static int buttonWithLongestPushTime(int[][] events){
        int index = events[0][0];
        int maxTime = events[0][1];

        for (int i = 1; i < events.length; i++) {
            int time = events[i][1] - events[i - 1][1];
            if(time == maxTime){
                index = Math.min(index , events[i][0]);
            }

            if(time > maxTime){
                maxTime = time;
                index = events[i][0];
            }
        }

        return index;
    }
}
