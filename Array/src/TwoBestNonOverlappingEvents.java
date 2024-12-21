import java.util.Arrays;

public class TwoBestNonOverlappingEvents {

    public static void main(String[] args) {
            int[][] arr = {
                    {1,3,2},
                    {4,5,2},
                    {2,4,3}
            };
        System.out.println(maxTwoEvents(arr));
    }

    public static int[][] memo = new int[100001][3];
    public static int maxTwoEvents(int[][] events){

        Arrays.sort(events , (a,b) -> Integer.compare(a[0] , b[0]));
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(events ,0 , 0);
    }

    public static int solve(int[][] events , int i , int count){

        if(count == 2 || i >= events.length){
            return 0;
        }

        if(memo[i][count] != -1){
            return memo[i][count];
        }

        int value = events[i][2];
        int nextIndex = binarySearch(events , events[i][1]);
        int take = value  + solve(events , nextIndex , count  + 1);
        int non_take = solve(events , i + 1 , count);

        memo[i][count] = Math.max(take , non_take);
        return memo[i][count];

    }

    public static int binarySearch(int[][] events , int endTime){
        int s = 0;
        int e = events.length - 1;

        int nextIndex = events.length;
        while(s <= e){
            int mid = s  + (e -s) / 2;

            if(events[mid][0] > endTime){
                nextIndex = mid;
                e = mid - 1;
            }else{
                s = mid  + 1;
            }
        }

        return nextIndex;
    }
}
