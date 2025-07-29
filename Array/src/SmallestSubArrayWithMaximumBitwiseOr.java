import java.util.Arrays;

public class SmallestSubArrayWithMaximumBitwiseOr {
    public static void main(String[] args) {
        int[] nums = {5,2,3,9,2,6,1,1,7,7};
        System.out.println(Arrays.toString(smallestSubArrays(nums)));
    }

//    public static int[] smallestSubArrays(int[] nums){
//        int n= nums.length;
//
//        int[] maxBitRight = new int[n];
//        maxBitRight[n - 1] = nums[n - 1];
//        int maxBit = nums[n - 1];
//
//        for (int i = n - 2; i >= 0 ; i--) {
//            if((maxBit | nums[i]) < nums[i]){
//                maxBit = nums[i];
//            }else{
//                maxBit |= nums[i];
//            }
//
//            maxBitRight[i] = maxBit;
//        }
//
//        int[] ans = new int[n];
//        for (int i = 0; i < n - 1; i++) {
//            int bitwiseOr = nums[i];
//            if(bitwiseOr == maxBitRight[i]){
//                ans[i] = 1;
//            }else {
//                for (int j = i + 1; j < n; j++) {
//                    bitwiseOr |= nums[j];
//                    if (bitwiseOr == maxBitRight[i]) {
//                        ans[i] = j - i + 1;
//                        break;
//                    }
//                }
//            }
//            if(ans[i] == 0){
//                ans[i] = n - i;
//            }
//        }
//
//        ans[n - 1] = 1;
//        return ans;
//    }

    private static int[] smallestSubArrays(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int[] lastPos = new int[32]; // last position of each bit
        Arrays.fill(lastPos, -1);

        for (int i = n - 1; i >= 0; i--) {
            // Update last seen position for each bit
            for (int b = 0; b < 32; b++) {
                if (((nums[i] >> b) & 1) == 1) {
                    lastPos[b] = i;
                }
            }

            int farthest = i;
            for (int b = 0; b < 32; b++) {
                if (lastPos[b] != -1) {
                    farthest = Math.max(farthest, lastPos[b]);
                }
            }

            ans[i] = farthest - i + 1;
        }

        return ans;
    }
}
