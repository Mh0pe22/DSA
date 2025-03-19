public class MinimumOperationToMakeBinaryElements {
    public static void main(String[] args) {
        int[] nums = {0 , 1, 1, 1, 0 , 0};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[]  nums){
        int n =  nums.length;
        int flip = 0;
        int flipFromPasti = 0;
        int k = 3;

        for (int i = 0; i < n; i++) {
            if(i >= k && nums[i - k] == 2){
                flipFromPasti--;
            }

            if(flipFromPasti % 2 == nums[i]){
                if(i + k > n){
                    return -1;
                }
                flipFromPasti++;
                nums[i] = 2;
                flip++;
            }
        }
        return flip;
    }
}
