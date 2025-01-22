import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MapOfHighestPeak {
    public static void main(String[] args) {
        int[][] isWater = {
                {0,1},
                {0,0}
        };

        System.out.println(Arrays.deepToString(highestPeak(isWater)));
    }

    public static int[][] highestPeak(int[][] isWater){
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] ans = new int[m][n];

        Queue<int[]> qu = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(isWater[i][j] == 1){
                    qu.offer(new int[]{i , j});
                    ans[i][j] = 0;
                }else{
                    ans[i][j] = -1;
                }
            }
        }

        int[][] direction = {{0 , -1} , {0, 1} , {-1 ,0} , {1, 0}};

        while(!qu.isEmpty()){
            int N = qu.size();

            while(N-- > 0){
                int[] cur = qu.poll();
                int i = cur[0];
                int j = cur[1];

                for(int[] dir : direction){
                    int i_ = i + dir[0];
                    int j_ = j + dir[1];

                    if(i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && ans[i_][j_] == -1){
                        ans[i_][j_] =  ans[i][j] + 1;
                        qu.offer(new int[]{i_ , j_});
                    }
                }
            }
        }

        return ans;
    }
}
