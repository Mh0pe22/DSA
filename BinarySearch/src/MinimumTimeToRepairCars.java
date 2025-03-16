import java.util.Arrays;

public class MinimumTimeToRepairCars {
    public static void main(String[] args) {
        int[]  rank = {4 ,2, 1, 3};
        int cars = 10;
        System.out.println(minimumTime(rank , cars));
    }

    public static long minimumTime(int[] rank , int cars){
        long l = 1;
        int maxR  = Arrays.stream(rank).max().orElseThrow();
        long r = (long) maxR * cars * cars;
        long ans = r;

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(isPossible(rank , mid , cars)){
                ans = mid;
                r = mid;
            }else{
                l = mid  + 1;
            }
        }

        return ans;
    }

    public static boolean isPossible(int[] rank , long mid , int cars){
        long carFixed = 0;
        for (int j : rank) {
            carFixed += (long) Math.sqrt( 1.0 * mid / j);
        }

        return carFixed >= cars;
    }
}
