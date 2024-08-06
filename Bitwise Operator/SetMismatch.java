import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(mismatch(arr)));
    }

    static int[] mismatch(int[] nums){
        int n = nums.length;
        int[] v = new int[n + 1];
        int missing = 0, duplicate = 0;

        for (int i = 0; i < n; i++) {
            v[nums[i]]++;
        }

        for (int i = 1; i < v.length; i++) {
            if (v[i] == 2) {
                duplicate = i;
            }
            if (v[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};    }



}
