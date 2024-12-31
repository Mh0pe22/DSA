import java.util.Arrays;

public class MinimumCostForTickets {
    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};

        System.out.println(minCostTickets(days , costs));
    }

    private static  int[] dp = new int[365];

    public static int solve(int[] days , int[] costs , int index , int length){
        if(index >= length){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int one_day_cost = costs[0] + solve(days , costs , index + 1 , length);

        int i = index;
        while (i < length && days[i] < days[index]+7 ){
            i++;
        }
        int seven_day_cost = costs[1] + solve(days ,costs , i , length);

        int j = index;
        while (j < length && days[j] < days[index] + 30){
            j++;
        }
        int thirty_days_cost = costs[2] + solve(days , costs , j , length);

        return dp[index]=Math.min(Math.min(one_day_cost , seven_day_cost) , thirty_days_cost);
    }
    public static int minCostTickets(int[] days , int[] costs){
        Arrays.fill(dp , -1);
        int n = days.length;

        return solve(days , costs , 0 , n);
    }
}
