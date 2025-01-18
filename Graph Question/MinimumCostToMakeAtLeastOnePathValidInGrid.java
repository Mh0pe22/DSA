import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumCostToMakeAtLeastOnePathValidInGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,1},
                {2,2,2,2},
                {1,1,1,1},
                {2,2,2,2}
        };

        System.out.println(minCost(dir));
    }

    private static final int[][] dir = {{0,1} , {0,-1}, {1, 0}, {-1,0}};
    public static int minCost(int[][] grid){

        int m = grid.length;
        int n= grid[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int[][] result = new int[m][n];
        for(int[] row: result){
            Arrays.fill(row , Integer.MAX_VALUE);
        }

        pq.offer(new int[]{0,0,0}); // {cost , row , col}
        result[0][0] = 0;

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currCost = curr[0];
            int i = curr[1];
            int j = curr[2];

            if(result[i][j] < currCost){
                continue;
            }

            for(int dirIndex = 0; dirIndex < 4; dirIndex++){
                int i_ = i + dir[dirIndex][0];
                int j_ = j + dir[dirIndex][1];

                if(i_ >= 0 && j_ >=0 && i_ < m && j_ < n){
                    int gridDir = grid[i][j];
                    int dirCost = (gridDir - 1 != dirIndex ? 1 : 0);

                    int newCost = currCost + dirCost;

                    if(newCost < result[i_][j_]){
                        result[i_][j_] = newCost;
                        pq.offer(new int[]{newCost , i_ , j_});
                    }
                }
            }
        }
        return result[m-1][n-1];
    }
}
