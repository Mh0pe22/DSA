package Back_Tracking;

import java.util.Arrays;

public class BackTracking {

    public static void main(String[] args) {

        boolean[][] arr ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int[arr.length][arr[0].length];
//        allPath("" , arr , 0 , 0);
        allPathStep("" , arr , 0 , 0, path , 1);
    }

    static void allPath(String p , boolean[][] arr, int r, int c){

        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }

        if(!arr[r][c]){
            return;
        }

//        I am considering this block in my path
        arr[r][c] = false;

        if(r < arr.length-1){
            allPath(p + 'D' , arr, r+1 , c);
        }

        if(c < arr[0].length -1){
            allPath(p + 'R' , arr, r , c + 1);
        }


        if(r > 0){
            allPath(p + 'U' , arr , r - 1 , c);
        }

        if (c > 0){
            allPath(p + 'L' , arr , r , c - 1);
        }

//        This line is where the function will be over
//        So before the function gets removed, also remove the changes that were made by that function

        arr[r][c] = true;


    }

    static void allPathStep(String p , boolean[][] arr, int r, int c , int[][] path, int step){

        if(r == arr.length-1 && c == arr[0].length-1){

            path[r][c] = step;
            for(int[] ans : path){
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(p);
            System.out.println();
        }


        if(!arr[r][c]){
            return;
        }

//        I am considering this block in my path
        arr[r][c] = false;
        path[r][c] = step;

        if(r < arr.length-1){
            allPathStep(p + 'D' , arr, r+1 , c, path , step + 1);
        }

        if(c < arr[0].length -1){
            allPathStep(p + 'R' , arr, r , c + 1 ,  path , step + 1);
        }


        if(r > 0){
            allPathStep(p + 'U' , arr , r - 1 , c, path , step + 1);
        }

        if (c > 0){
            allPathStep(p + 'L' , arr , r , c - 1, path , step + 1);
        }

//        This line is where the function will be over
//        So before the function gets removed, also remove the changes that were made by that function

        arr[r][c] = true;
        path[r][c] = 0;

    }
}
