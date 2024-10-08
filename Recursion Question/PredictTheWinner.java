import java.util.Arrays;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        System.out.println(predictTheWinner(arr));
    }

    public static int[][] memo = new int[23][23];
    public static boolean predictTheWinner(int[] arr){
        int sum = 0;

        for(int[] row : memo){
            Arrays.fill(row , -1);
        }
        for(int i: arr){
            sum += i;
        }

        int player_1 = solve(0 , arr.length - 1 , arr);
        int player_2 = sum - player_1;

        return player_1 >= player_2;
    }

    public static int solve(int i, int j , int[] arr){
        if(i > j){
            return 0;
        }

        if(i == j){
            return arr[i];
        }

        if(memo[i][j] != -1){
            return memo[i][j];
        }
        int player_1 = arr[i] + Math.min(solve(i + 2 , j , arr) , solve(i +1 , j - 1 , arr));
        int player_2 = arr[j] + Math.min(solve(i , j - 2 , arr) , solve(i +1 , j - 1 , arr));

        memo[i][j] = Math.max(player_1 , player_2);
        return memo[i][j];
    }
}
