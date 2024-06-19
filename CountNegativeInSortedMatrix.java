public class CountNegativeInSortedMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(arr));
    }

    public static int countNegatives(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int r = m - 1, c = 0, count = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                count += n - c;
                r--;
            } else {
                c++;
            }
        }
        return count;
    }

//    public static int countNegatives(int[][] mat){
//        int s = 0;
//        int e = mat[0].length - 1;
//        int i = 0;
//        int count = 0;
//        while(i < mat.length && s <= e){
//            int mid = s + (e - s) / 2;
//
//            if(s  == e){
//                i++;
//                s = 0;
//                e = mat[0].length  - 1;
//            }
//            if(mat[i][mid] < 0){
//                if(mid != 0 && mat[i][mid - 1] < 0){
//                    e = mid - 1;
//                }else{
//                    count = count + mat.length - e;
//                }
//            }else{
//                s = mid + 1;
//            }
//        }
//
//        return count;
//    }
}
