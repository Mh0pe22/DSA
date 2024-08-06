package Array;

public class Max_And_Min {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int n = arr.length;
        System.out.println( "Max : "+ max(arr ,n , arr[arr.length - 1]));
        System.out.println( "Min : "+ min(arr ,n , arr[arr.length - 1]));
    }

    static int max(int[] arr , int length , int ans) {
        if (length == 0) {
            return ans;
        }

        if (ans < arr[length - 1]) {

            ans = arr[length - 1];
        }

        return max(arr , length - 1 , ans);
    }

    static int min(int[] arr , int length , int ans) {
        if (length == 0) {
            return ans;
        }

        if (ans > arr[length - 1]) {

            ans = arr[length - 1];
        }

        return min(arr , length - 1 , ans);
    }
}

