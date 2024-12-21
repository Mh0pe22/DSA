public class TransformedArray {

    public static void main(String[] args) {

    }

    public static int[] constructTransformedArray(int[] nums){
        
        int[] ans = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int index ;
            if(nums[i] > 0){
                ans[i] = nums[(nums[i] + i) % n];
            } else if (nums[i] < 0) {
                int newIndex = (i + nums[i]) % n;
                if (newIndex < 0) newIndex += n;
                ans[i] = nums[newIndex];
            }else{
                ans[i] = nums[i];
            }
        }

        return ans;
    }
}
