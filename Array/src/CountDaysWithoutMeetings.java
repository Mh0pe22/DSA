import java.util.Arrays;

public class CountDaysWithoutMeetings {
    public static void main(String[] args) {
        int days = 10 ;
        int[][] meetings = {
                {5, 7},
                {1 , 3},
                {9 , 10}
        };
        System.out.println(countDays(days , meetings));
    }

    public static int countDays(int days , int[][] meetings){

        Arrays.sort(meetings , (a , b) -> Integer.compare(a[0] , b[0]));
        int last = 1;
        int ans = 0;

        for (int i = 0; i < meetings.length; i++) {
            int s = meetings[i][0];
            int e = meetings[i][1];

            if(s > last){
                ans += (i == 0) ? (s - last) : (s - last - 1);
            }
            last = Math.max(last , e);
        }
        if(days > last){
            ans += (days - last);
        }
        return ans;
    }
}
