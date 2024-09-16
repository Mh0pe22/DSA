public class MaximumMultiplicatiopnScore {
    public static void main(String[] args) {

    }

    public static long maxScore(int[] a, int[] b){

        long sum = 0;
        if(b .length == 4){
            for (int i = 0; i < 4; i++) {
                sum += ((long) a[i] * b[i]);
            }
        }


        return sum;
    }
}
