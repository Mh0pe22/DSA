package Array;

import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {

        int[] arr = {1 , 7 , 8 , 14 , 16 , 11 , 22 ,22};
//        System.out.println(find(arr ,0 , 0));
//        System.out.println(search(arr , 0 , 0));
        System.out.println(search2(arr , 22 , 0 ));
    }



    static boolean find(int[] arr , int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr , target ,index + 1);
    }

    static int search(int[] arr , int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){

            return index;
        }

        return search(arr , target ,index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> search1(int[] arr ,int target , int index ,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return search1(arr, target, index + 1, list);
    }

    static ArrayList<Integer> search2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = search2(arr, target , index + 1);
        list.addAll(ansFromBelow);

        return list;
    }
}


