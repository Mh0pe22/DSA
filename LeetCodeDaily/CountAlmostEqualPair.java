import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountAlmostEqualPair {
    public static void main(String[] args) {
        int[] arr = {123, 231};
        System.out.println(countPairs(arr));
    }


    public static int countPairs(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            StringBuilder target = new StringBuilder(Integer.toString(arr[i]));
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[j] == Integer.parseInt(target.reverse().toString())){
                    count++;
                }
                if(target.length() == 1){
                    if(arr[j] == Integer.parseInt(target.toString()) * 10){
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
