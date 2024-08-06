package Back_Tracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {

//        System.out.println(countPath(3,3));
//        path("" , 3 , 3);
//        System.out.println(pathRet("" , 3, 3));
//        System.out.println(pathRetDiagonal("" , 3, 3));
        boolean[][] arr ={
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        pathObstacle("" , arr , 0 ,0);
    }

    static int countPath(int r, int c){

        if(r == 1 || c == 1){
            return 1;
        }

        int left = countPath(r-1 ,c);
        int right = countPath(r , c - 1);

        return left + right;
    }

    static void path(String p ,int r, int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D' , r-1, c);
        }

        if(c > 1){
            path(p + 'R' , r , c - 1);
        }
    }

    static ArrayList<String> pathRet(String p , int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathRet(p + 'D' , r-1, c));
        }

        if(c > 1){
            list.addAll(pathRet(p + 'R' , r , c - 1));
        }

        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p , int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + 'D' , r-1, c - 1));
        }

        if(r > 1){
            list.addAll(pathRetDiagonal(p + 'V' , r-1, c));
        }

        if(c > 1){
            list.addAll(pathRetDiagonal(p + 'H' , r , c - 1));
        }

        return list;
    }

    static void pathObstacle(String p ,boolean[][] arr, int r, int c){

        if(r == arr.length- 1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }

        if(!arr[r][c]){
          return;
        }

        if(r < arr.length -1){
            pathObstacle(p + 'D' , arr,r+1, c);
        }

        if(c < arr[0].length - 1){
            pathObstacle(p + 'R' , arr,  r , c + 1);
        }
    }

}
