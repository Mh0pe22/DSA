import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {
        int[] players = {4 , 7 , 9};
        int[] trainers = {8 , 2, 5, 8};
        System.out.println(matchPlayersAndTrainers(players ,trainers));
    }

    public static int matchPlayersAndTrainers(int[] players , int[] trainers){
        int n = players.length;
        int m = trainers.length;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < n && j < m){
            if(players[i] <= trainers[j]){
                ans++;
                i++;
                j++;
            }else if(players[i] > trainers[j]){
                j++;
            }else {
                break;
            }
        }

        return ans;
    }
}
