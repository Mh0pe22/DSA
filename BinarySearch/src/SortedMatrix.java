import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
    int [][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
        System.out.println(Arrays.toString(search(arr, 5)));
    }

//    Search in the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while (cStart <= cEnd){

            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid +1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){

        int row = matrix.length;
        int col = matrix[0].length; // Matrix may be empty

        if(row == 1){
            return binarySearch(matrix, 1, 0, col-1,target);
        }

//        run the loop until two rows are remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col /2;

        while(rStart < (rEnd - 1 )){

            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }else if(matrix[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }

//            now we have two rows
//            check whether the target in col of the 2 rows
            if(matrix[rStart][cMid] == target){
                return new int[] {rStart, cMid};
            }else if(matrix[rStart+1][cMid] == target){
                return  new int[] {rStart + 1, cMid};
            }

//            search in 1st half
            if(target <= matrix[rStart][cMid -1]){

                return binarySearch(matrix , rStart , 0, cMid -1, target);
            }
//            search in 2nd half
            if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]){

                return binarySearch(matrix , rStart , cMid + 1, col -1, target);
            }
//            search in 3rd half
            if(target <= matrix[rStart + 1][cMid -1]){

                return binarySearch(matrix , rStart + 1 , 0, cMid -1, target);
            }
//            search in 4th half
            else {

                return binarySearch(matrix , rStart + 1 , cMid + 1, col - 1, target);
            }
        }
        return new int[] {-1, -1};
    }
}
