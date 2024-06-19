public class SearchInsert {

    public static void main(String[] args) {

        int[] arr= {-1 , 3 ,4 , 5};
        int target = 0;
        System.out.println(searchInsert(arr , target));
    }

    public static int searchInsert(int[] arr , int target){

        if(target == 0 && arr[0] == 1){
            return 0;
        }

        if(arr.length == 1){
            if(arr[0] <= 1 && target <= 1){
                return 0;
            }else{
                return arr.length;
            }
        }

        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e -s) /2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        if(e > 0 && arr[e] > target){
            return e;
        }

        return e + 1;
    }
}
