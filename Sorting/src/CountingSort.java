import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingSort {

    // Use only for small values in array
    public static void countingSort(int[] arr){

        if(arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];

        for (int i : arr){
            if(i > max){
                max = i;
            }
        }

        int[] frequency = new int[max + 1];

        for (int j : arr) {
            frequency[j]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {

            while (frequency[i] > 0){
                arr[index] = i;
                index++;
                frequency[i]--;
            }
        }
    }

    public static void hash(int[] arr){

        if(arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int small = Arrays.stream(arr).min().getAsInt();

        Map<Integer , Integer> hashMap = new HashMap<>();

        for (int i : arr){
            hashMap.put( i , hashMap.getOrDefault(i , 0)  + 1);
        }

        int index = 0;
        for (int i = small ; i <= max; i++) {
            int count = hashMap.getOrDefault(i , 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,1,8,9,10};
        hash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
