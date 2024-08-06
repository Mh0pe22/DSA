import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {

    public static void main(String[] args) {

        int[] arr = {2,1,4,5,6,3,3,2};
        System.out.println(allDuplicateNumber(arr));
    }

    static List<Integer> allDuplicateNumber(int[] arr){

        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while (i < arr.length){

            int start = arr[i] -1;
            if(arr[i] != arr[start]){
                swap(arr , i ,start);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }

        }
        return ans;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
