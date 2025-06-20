public class MaximumManhattanDistanceAfterKChanges {
    public static void main(String[] args) {
        String s = "NSWWEW";
        int k = 3;
        System.out.println(maxDistance(s , k));
    }

    public static int maxDistance(String s , int k){
        int N = 0;
        int S = 0;
        int W = 0;
        int E = 0;

        int maxMD = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'N')N++;
            else if(s.charAt(i) == 'S')S++;
            else if (s.charAt(i) == 'W')W++;
            else if(s.charAt(i) == 'E')E++;

            int currMD  = Math.abs(N - S) + Math.abs(E - W);

            int steps = i + 1;
            int wasted = steps - currMD;

            int extra = Math.min(2 * k , wasted);

            int finalCurrMD = currMD + extra;

            maxMD = Math.max(maxMD , finalCurrMD);
        }

        return maxMD;
    }
}
