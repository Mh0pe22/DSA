import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        int[] A= {1,3,2,4};
        int[] B= {3,1,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }

    public static int[] findThePrefixCommonArray(int[] A , int[] B){

        Map<Integer , Integer> mp = new HashMap<>();
        int[] ans = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {

            if (mp.containsKey(A[i])) {
                count++;
            } else {
                mp.put(A[i], 1);
            }

            if (mp.containsKey(B[i])) {
                count++;
            } else {
                mp.put(B[i], 1);
            }

                ans[i] = count;
        }

        return ans;
    }
}
