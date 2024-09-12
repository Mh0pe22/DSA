import java.util.Arrays;

public class MaxFrequency {

    public static void main(String[] args) {

        int[] arr = {1,4,8,13};
        int k = 5;

        System.out.println(maxFreq(arr , k));
    }

    public static int maxFreq(int[] arr , int k){

        int ans = 1;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = i;
            int total = 0;

            while (s <= e){
                int mid = s + (e - s) / 2;

                total = arr[i] * (i - mid + 1) - sum(arr, mid, i);

                if (total <= k) {
                    ans = Math.max(ans, i - mid + 1);
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }

    private static int sum(int[] arr, int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += arr[i];
        }
        return total;
    }
}
