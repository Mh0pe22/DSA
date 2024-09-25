public class WordSearch {
    public static void main(String[] args) {
        char[][] grid = {
                {'a' , 'b' , 'c' , 'e'},
                {'s', 'f' , 'c' , 's'},
                {'a' , 'd' ,'e' , 'e'}
        };

        String a = "abcced";
        System.out.println(exist(grid , a));
    }

    public static boolean exist(char[][] grid , String word){
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == word.charAt(0) && dfs(grid , i , j , 0 , word)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] grid , int i , int j ,int idx , String word){

        int m = grid.length;
        int n = grid[0].length;

        if(idx == word.length()){
            return true;
        }

        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != word.charAt(idx) || grid[i][j] == '$'){
            return false;
        }

        char temp = grid[i][j];
        grid[i][j] = '$';

        boolean ans = (dfs(grid , i + 1 , j , idx + 1, word )
        || dfs(grid , i - 1 , j , idx + 1, word)
        || dfs(grid , i ,j + 1, idx + 1 , word)
        || dfs(grid , i , j - 1, idx + 1 , word));

        grid[i][j] = temp;

        return ans;
    }
}
