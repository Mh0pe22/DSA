import java.util.Arrays;

public class MaximumNumberOfEventsThatCanBeAttended2 {
    public static void main(String[] args) {
        int[][] events = {
                {1 , 2 , 4},
                {3, 4, 3},
                {2, 3, 1}
        };
        int k = 2;
        System.out.println(maxvalue(events , k));
    }

    private static int n ;
    private static int[][] t;

    public static int solve(int[][] events , int i , int k){
        if(k == 0 || i >= n){
            return 0;
        }

        int start = events[i][0];
        int end = events[i][1];
        int val = events[i][2];

        if(t[i][k] != -1){
            return t[i][k];
        }

        int j = i + 1;
        for(; j < n; j++){
            if(events[j][0] > events[i][1]){
                break;
            }
        }

        int taake = val + solve(events , j , k - 1);
        int skip = solve(events , i + 1 , k);

        return t[i][k] = Math.max(taake , skip);
    }
    public static int maxvalue(int[][] events , int k){
        Arrays.sort(events , (a , b) -> Integer.compare(a[0] , b[0]));

        n = events.length;
        t = new int[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(t[i] , -1);
        }

        return solve(events , 0 , k);
    }
}
