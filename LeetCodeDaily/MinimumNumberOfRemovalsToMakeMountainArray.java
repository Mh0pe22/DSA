import java.util.Arrays;

public class MinimumNumberOfRemovalsToMakeMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,3,1};
        System.out.println(minimumMountainRemovals(arr));
    }

    public static int minimumMountainRemovals(int[] num){

        int n = num.length;
        int[] LIS = new int[n];
        Arrays.fill(LIS , 1);

        int[] LDS = new int[n];
        Arrays.fill(LDS , 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(num[i] > num[j]){
                    LIS[i] = Math.max(LIS[i] , LIS[j] + 1);
                }
            }
        }

        for (int i = n - 1; i >= 0 ; i--) {
            for (int j = n- 1; j > i ; j--) {
                if(num[i] > num[j]){
                    LDS[i] = Math.max(LDS[i] , LDS[j] + 1);
                }
            }
        }

        int minRemoval = n;
        for (int i = 0; i < n; i++) {
            if(LIS[i] > 1 && LDS[i] > 1){
                minRemoval = Math.min(minRemoval, n - LIS[i] - LDS[i] + 1);
            }
        }

        return minRemoval;
    }
}
