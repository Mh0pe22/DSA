public class ShortestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "abac";
        String s2 = "cab";
        System.out.println(shortestCommonSubsequence(s1 , s2));
    }

    public static String shortestCommonSubsequence(String s1 , String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] mat = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if(i == 0 || j == 0){
                    mat[i][j] = i + j;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    mat[i][j] = 1 + mat[i-1][j-1];
                }else{
                    mat[i][j] = 1 + Math.min(mat[i-1][j] , mat[i][j-1]);
                }
            }
        }

        StringBuilder sb =  new StringBuilder();
        int i = m;
        int j = n;
        while(i > 0 && j > 0){
            if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                sb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else{
                if(mat[i-1][j] < mat[i][j-1]){
                    sb.append(s1.charAt(i-1));
                    i--;
                }else{
                    sb.append(s2.charAt(j-1));
                    j--;
                }
            }
        }

        while (i > 0){
            sb.append(s1.charAt(i - 1));
            i--;
        }

        while (j > 0){
            sb.append(s2.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString();
    }
}
