import java.util.ArrayList;
import java.util.List;

public class AllMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,3,2,1,6,2,7};

        System.out.println(findMissing(arr));
    }

    public static List<Integer> findMissing(int[] arr) {

        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while (i < arr.length) {

            int start = arr[i] - 1;
            if (arr[i] != arr[start]) {
                swap(arr, i, start);
            } else {
                i++;
            }


            }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }

        }
        return ans;
    }

   static   void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
