import java.util.Arrays;

public class RotatingTheBox {
    public static void main(String[] args) {
        char[][] arr = {
                {'#' , '.' , '#' ,'*'},
                {'.' , '#' , '*' , '.'}
        };

        System.out.println(Arrays.toString(rotateTheBox(arr)));
    }

    public static char[][] rotateTheBox(char[][] box){

        int n = box[0].length;
        int m = box.length;
        char[][] ans = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = box[j][i];
            }
        }

        for(char[] i : ans){
            reverseRow(i);
        }

        for (int i = 0; i < m; i++) {

            int emptyRow = n - 1;
            for (int j = n - 1; j >= 0 ; j--) {
                if(ans[j][i] == '*'){
                    emptyRow = j - 1;
                    continue;
                }

                if(ans[j][i] == '#'){
                    ans[j][i] = '.';
                    ans[emptyRow][i] = '#';
                    emptyRow--;
                }
            }
        }
        return ans;
    }

    public static void reverseRow(char[] row){
        int left = 0, right = row.length - 1;
        while (left < right) {
            char temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
