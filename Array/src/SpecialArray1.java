public class SpecialArray1 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        System.out.println(isArraySpecial(nums));
    }

    public static boolean isArraySpecial(int[] nums){

        if(nums.length == 1){
            return true;
        }

        int prev = nums[0] % 2 == 0 ? 0 : 1;
        for (int i = 1; i < nums.length ; i++) {
            int cur = nums[i] % 2 == 0 ? 0 : 1;

            if(cur == prev){
                return false;
            }

            prev = cur;
        }

        return true;
    }
}
