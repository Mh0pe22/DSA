public class GreddyCandy {
    public static void main(String[] args) {
        int[] ratings = {1 , 2, 2};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings){
        int n = ratings.length;
        int i = 1;
        int candy = n;

        while(i < n){

            if(ratings[i] == ratings[i - 1]){
                i++;
                continue;
            }

            int peak = 0;
            while(i < n && ratings[i] > ratings[i - 1]){
                peak++;
                candy += peak;
                i++;

            }

            int dip = 0;
            while(i < n && ratings[i] < ratings[i - 1]){
                dip++;
                candy += dip;
                i++;
            }

            candy -= Math.min(peak, dip);
        }

        return candy;
    }
}
