public class MinimumOperationsToMakeArrayElementsZero {

    public static void main(String[] args) {
        int[][] queries = {
                {1, 2},
                {2, 4}
        };

        System.out.println(minOperations(queries));
    }

    public static long solve(int l , int r){

        long L = 1;
        long S = 1;
        long steps = 0;

        while (L <= r){
            long R = (4 * L) - 1;

            long start = Math.max(L , (long)l);
            long end = Math.min(R, (long)r);

            if(start <= end){
                steps += (end - start + 1) * S;
            }

            S += 1;
            L = L * 4;
        }

        return steps;
    }
    public static long minOperations(int[][] queries){

        long steps = 0;
        for(int[] query: queries){
            int l = query[0];
            int r = query[1];

            long op = solve(l , r);

            steps += (op + 1) / 2;
        }

        return steps;
    }

    
}
