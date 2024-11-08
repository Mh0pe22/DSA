import java.util.Arrays;

public class MaximumXORForEachQuery {
    public static void main(String[] args) {

        int[] arr= {0,1,1,3};
        int maxBit = 2;
        System.out.println(Arrays.toString(getMaximumXor(arr , maxBit)));
    }

    public static int[] getMaximumXor(int[] nums , int maximumBit){

        int XOR = 0;
        for(int i : nums){
            XOR ^= i;
        }

        int mask  = (1 << maximumBit) - 1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int flip = XOR ^ mask;
            ans[i] = flip;

            XOR ^= nums[nums.length - 1 - i];
        }

        return ans;
    }
}
