public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
    int[] a = {1,5,6,7};
    }

    public static int subSetXORSum(int[] arr){
    return rec(arr , 0 ,0);
    }

    public static int rec(int[] arr , int i , int total){

        if(i == arr.length){
            return total;
        }

        return rec(arr , i + 1, total^arr[i]) + rec(arr , i + 1, total);
    }
}
