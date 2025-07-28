public class CountNumberOfMaximumBitwiseOrSubsets {
    public static void main(String[] args) {
        int[] nums = {3 ,2 ,1 ,5};
        System.out.println(countMaxOrSubset(nums));
    }

    public static int countMaxOrSubset(int[] nums){
        int maxOr = 0;
        for(int num : nums){
            maxOr |= num;
        }

        int currentXor = 0;
        return countSubset(0 , currentXor , maxOr , nums);
    }

    private static int countSubset(int idx , int currentXor , int maxOr , int[] nums){
        if(idx == nums.length){
            if(currentXor == maxOr){
                return 1;
            }

            return 0;
        }

        int take = countSubset(idx + 1 , currentXor | nums[idx] , maxOr , nums);
        int notTake = countSubset(idx + 1, currentXor , maxOr , nums);

        return take + notTake;
    }
}
