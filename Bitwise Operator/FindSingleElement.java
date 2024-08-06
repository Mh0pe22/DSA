public class FindSingleElement {

    public static int findSingle(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3};
        int result = findSingle(nums);
        System.out.println("The element that occurs only once is: " + result);
    }
}
