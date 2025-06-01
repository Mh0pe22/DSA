public class DistributeCandiesAmongChildren2 {
    public static void main(String[] args) {
        int n = 5;
        int limit = 2;
        System.out.println(distributedCandies(n , limit));
    }

    public static long distributedCandies(int n , int limit){
        int minChild1 = Math.max(0 , n - 2 * limit);
        int maxChild1 = Math.min(n , limit);

        long ways = 0;
        for (int i = minChild1; i <= maxChild1; i++) {
            int N = n - i;

            int minChild2 = Math.max(0 , N - limit);
            int maxChild2 = Math.min(N , limit);

            ways += (maxChild2 - minChild2 + 1);
        }

        return ways;
    }
}
