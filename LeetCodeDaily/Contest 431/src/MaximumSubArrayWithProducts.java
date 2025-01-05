public class MaximumSubArrayWithProducts {
    public static void main(String[] args) {

    }

    public static int maxLength(int[] nums){
        int n = nums.length;
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            long product = 1;
            int gcd = 0;
            long lcm = 1;

            for (int end = start; end < n; end++) {
                product *= nums[end];
                gcd = gcd == 0 ? nums[end] : gcd(gcd, nums[end]);
                lcm = lcm(nums[end], lcm);

                if (product == lcm * gcd) {
                    maxLength = Math.max(maxLength, end - start + 1);
                }
            }
        }

        return maxLength;
    }

    static int gcd(int a , int b){

        if(a == 0){
            return b;
        }
        return gcd((b % a) , a);
    }

    static long lcm(int a, long b){

        return (a * b) / gcd(a,(int)b);
    }
}
