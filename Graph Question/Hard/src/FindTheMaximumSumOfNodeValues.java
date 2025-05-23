public class FindTheMaximumSumOfNodeValues {
    public static void main(String[] args) {
        int[] nums = { 1, 2 , 1};
        int k = 3;
        int[][] edges = {
                {0 , 1},
                {0 , 2}
        };

        System.out.println(maximumValueSum(nums , k  , edges));
    }

    public static long maximumValueSum(int[] nums , int k , int[][] edges){
        long sum = 0;
        int count  =0;
        long minNukshan = Integer.MAX_VALUE;

        for(long num : nums){
            if((num ^ k) > num){
                sum += (num ^ k);
                count++;
            }else{
                sum += num;
            }

            minNukshan = Math.min(minNukshan , Math.abs(num - (num ^ k)));
        }

        if (count % 2  == 0){
            return sum;
        }

        return sum - minNukshan;
    }
}
