public class PathWithMaximumGold {
    public static void main(String[] args) {
        int[][] gold = {
                {1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
        };

        System.out.println(getMaximumGold(gold));
    }

    public static int getMaximumGold(int[][] gold){

        int maxGold = 0;

        for (int i = 0; i < gold.length; i++) {
            for (int j = 0; j < gold[0].length; j++) {

                if(gold[i][j] != 0){
                    maxGold = Math.max(maxGold , DFS(gold , i , j));
                }
            }
        }

        return maxGold;
    }

    public static int DFS(int[][] gold , int i , int j){

        int[][] direction= {
                {-1 , 0},
                {1 , 0},
                {0 , 1},
                {0 , -1}
        };
        if(i >= gold.length || j >= gold[0].length || i < 0 || j < 0 || gold[i][j] == 0){
            return 0;
        }

        int originalGoldValue = gold[i][j];
        gold[i][j] = 0;

        int maxGold = 0;
        for(int[] dir : direction){
            int new_i = i + dir[0];
            int new_j = j + dir[1];

            maxGold = Math.max(maxGold , DFS(gold , new_i , new_j));
        }

        gold[i][j] = originalGoldValue;

        return originalGoldValue + maxGold;
    }
}
