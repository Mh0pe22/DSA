import java.util.LinkedList;
import java.util.Queue;

public class MaximumNumberOfFishInGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {0,2,1,0},
                {4,0,0,3},
                {1,0,0,4},
                {0,3,2,0}
        };
        System.out.println(findMaxFish(grid));
    }

    public static int[][] direction = {{-1 , 0} ,{1 , 0} ,{0, -1} ,{ 0, 1}};
    public static int findMaxFish(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int fishCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] > 0){
                    fishCount = Math.max(fishCount , BFS(i , j , grid ));
                }
            }
        }

        return fishCount;
    }

    public static int BFS(int i, int j, int[][] grid ){
        int m = grid.length;
        int n = grid[0].length;
        int count = grid[i][j];
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{i , j});

        grid[i][j] = 0;
        while(!que.isEmpty()){
            int[] cur = que.poll();
            i = cur[0];
            j = cur[1];

            for(int[] dir : direction){
                int i_ = i + dir[0];
                int j_ = j + dir[1];

                if(i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && grid[i_][j_] > 0){
                    count += grid[i_][j_];
                    grid[i_][j_] = 0;
                    que.offer(new int[]{i_ ,j_});
                }
            }
        }
        return count;
    }
}
