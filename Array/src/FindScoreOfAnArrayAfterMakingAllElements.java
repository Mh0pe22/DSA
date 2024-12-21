import java.util.Arrays;

public class FindScoreOfAnArrayAfterMakingAllElements {
    public static void main(String[] args) {

    }

    public static long findScore(int[] nums){

        int[][] temp = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }

        Arrays.sort(temp, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        long score = 0;

        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {

            int value = temp[i][0];
            int index = temp[i][1];

            if(!visited[index]){
                score += value;

                if(index - 1 >= 0 && !visited[index - 1]){
                    visited[index - 1] = true;
                }

                if(index + 1 < nums.length && !visited[index + 1]){
                    visited[index + 1] = true;
                }
            }
        }

        return score;
    }
}
