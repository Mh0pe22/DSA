public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        int[] nums = {-5 , -10 , -5};
        System.out.println(maxAdjacentDistance(nums));
    }

    public static int maxAdjacentDistance(int[] nums){
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length; i++) {
            int diff = i == nums.length - 1 ? Math.abs(nums[i] - nums[0]) : Math.abs(nums[i] - nums[i + 1]);
            maxDiff = Math.max(maxDiff , diff);
        }
        return maxDiff;
    }
}
