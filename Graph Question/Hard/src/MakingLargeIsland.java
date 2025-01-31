import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakingLargeIsland {
    public static void main(String[] args) {
        int[][] grid = {
                {1,0,1,1},
                {1,1,0,1},
                {0,0,1,0}
        };

        System.out.println(largestIsland(grid));
    }

    public static int largestIsland(int[][] grid){

        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        int id = 2;
        Map<Integer , Integer> mp = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1){
                    int size = dfs(grid , i , j , id);
                    maxArea = Math.max(size , maxArea);
                    mp.put(id , size);
                    id++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 0){
                    Set<Integer> uniqueId = new HashSet<>();

                    for(int[] dir : direction){
                        int i_ = i + dir[0];
                        int j_ = j + dir[1];

                        if(i_ >=0 && j_ >= 0 && i_ < m && j_ < n){
                            uniqueId.add(grid[i_][j_]);
                        }
                    }

                    int sum = 1;
                    for(int uniId : uniqueId){
                        sum += mp.get(uniId);
                    }

                    maxArea = Math.max(maxArea , sum);
                }
            }
        }

        return maxArea;
    }

    public static int[][] direction = {{-1 ,0} ,{1 , 0} , {0 , -1} , {0 ,1}};

    public static int dfs(int[][] grid , int i , int j , int id) {

        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || j < 0 || i > m || j > n || grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = id;
        int count = 1;
        for (int[] dir : direction) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];

            count += dfs(grid, i_, j_, id);
        }
        return count;
    }
}
