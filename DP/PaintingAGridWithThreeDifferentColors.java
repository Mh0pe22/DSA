import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintingAGridWithThreeDifferentColors {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        System.out.println(colorTheGris(m ,n));
    }

    private static List<String> columnStates = new ArrayList<>();
    private static int[][]t;
    private static final int MOD = 1_000_000_007;

    private static void generateColumnStates(String currentColumn , int rowRemaining , char prevColor){
        if(rowRemaining == 0){
            columnStates.add(currentColumn);
            return;
        }

        for(char color : new char[]{'R' , 'G' , 'B'}){
            if(color == prevColor){
                continue;
            }
            generateColumnStates(currentColumn + color , rowRemaining - 1, color);
        }
    }

    private static int solve(int remainingCols , int prevColumnIdx , int m){
        if(remainingCols == 0){
            return 1;
        }

        if(t[remainingCols][prevColumnIdx] != -1){
            return t[remainingCols][prevColumnIdx];
        }

        int totalWays = 0;
        String prevColumn = columnStates.get(prevColumnIdx);

        for(int nextColumnIdx =0; nextColumnIdx < columnStates.size(); nextColumnIdx++){
            String nextColumn = columnStates.get(nextColumnIdx);
            boolean valid = true;

            for(int r = 0; r  < m; r++){
                if(prevColumn.charAt(r) == nextColumn.charAt(r)){
                    valid = false;
                    break;
                }
            }

            if(valid){
                totalWays = (totalWays + solve(remainingCols - 1, nextColumnIdx , m)) % MOD;
            }
        }

        return t[remainingCols][prevColumnIdx] = totalWays;
    }
    public static int colorTheGris(int m , int n){
        columnStates.clear();
        generateColumnStates("" , m , '#');

        int numColumnPatterns = columnStates.size();
        t = new int[n][numColumnPatterns];
        for(int[] row : t){
            Arrays.fill(row , -1);
        }

        int result = 0;
        for (int i = 0; i < numColumnPatterns; i++) {
            result = (result + solve(n - 1 , i , m)) % MOD;
        }

        return result;
    }
}
