import java.util.Arrays;

public class TwoSnekyNumberOfDigitive {
    public static void main(String[] args) {
        int[] arr = {7,1,5,4,3,4,6,0,9,5,8,2};
        System.out.println(Arrays.toString(getSneakyNumber(arr)));
    }

    public static int[] getSneakyNumber(int[] arr){

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

        int[] ans = new int[2];
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                ans[k] = arr[j];
                k++;
            }

            if (k == 2) {
                break;
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second){
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
