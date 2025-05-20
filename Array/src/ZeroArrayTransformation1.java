public class ZeroArrayTransformation1 {
    public static void main(String[] args) {
        int[] nums = {0 ,1 , 1};
        int[][] queries = {{0 , 2}};
        System.out.println(isZeroArray(nums , queries));
    }

    public static boolean isZeroArray(int[] nums , int[][] queries){
        int n = nums.length;
        int[] diff = new int[n];

        for(int[] num : queries){
            int start = num[0];
            int end = num[1];
            int x = 1;

            diff[start] += x;
            if(end + 1  < n){
                diff[end + 1] -= x;
            }
        }

        int[] cumSum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
             sum += diff[i];
            cumSum[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            if(cumSum[i] < nums[i]){
                return false;
            }
        }
        return true;
    }
}
