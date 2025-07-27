public class CountHillsAndValleyInArray {
    public static void main(String[] args) {
        int[] nums = {21,21,21,2,2,2,2,21,21,45};
        System.out.println(countHillsCValley(nums));
    }

    public static int countHillsCValley(int[] nums){
        int count = 0;
        int n = nums.length;

        int prev = nums[0];
        int next = nums[2];
        for (int i = 1; i < n - 1; i++) {
            if(nums[i] == prev){
                next = i + 2 < n ? nums[i + 2] : next;
                continue;
            }

            int j = i + 1;
            if(nums[i] == next) {
                while (j < n && next == nums[i]) {
                    next = nums[j];
                    j++;
                }
            }

            if(nums[i] > prev && nums[i] > next || nums[i] < prev && nums[i] < next){
                prev = nums[i];
                next = i + 2 < n ? nums[i + 2] : next;
                count++;
            }

        }

        return count;
    }
}
