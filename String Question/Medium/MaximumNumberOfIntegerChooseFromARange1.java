package Medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegerChooseFromARange1 {

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int n = 5;
        System.out.println(maxCount(arr , n , 6));
    }

    public static int maxCount (int[] banned , int n , int  maxSum){

        int count = 0;
        int sum = 0;

        Set<Integer> set = new HashSet<>();
        for (int j : banned) {
            set.add(j);
        }

        for (int i = 1; i < n; i++) {
            if(set.contains(i)){
                continue;
            }

            if(sum + i <= maxSum){
                count++;
                sum += i;
            }
        }

        return count++;
    }
}
