public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(arr , target));
    }

    public static int search(int[] arr , int target){
        return binary(arr, target , 0 , arr.length - 1);
    }

    public static int binary(int[] arr , int target , int s ,int e){
        if(s > e){
            return  -1;
        }

        int mid = s + (e - s) /2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binary(arr , target , s , mid - 1);
        }else {
            return binary(arr , target , mid  + 1  , e);
        }
    }
}
