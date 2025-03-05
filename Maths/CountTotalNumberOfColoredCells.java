public class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(coloredCells(n));
    }

    public static long coloredCells(int n){
/*
        long colored  = 1;
        int t  = 1;
        while(t <= n){
            colored += 4L * (t -1);
            t++;
        }
        return colored;*/

        return 1 + (2 * ((long) n * (n-1)));
    }
}
