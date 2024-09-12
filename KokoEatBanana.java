import java.util.Arrays;

public class KokoEatBanana {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int hour = 5;
        System.out.println(minK(arr , hour));
    }

    public static int minK(int[] piles , int h){

        int s = 1;
        int e = 0;

        for (int i : piles){
            if( e < i){
                e = i;
            }
        }

        while(s < e){
            int mid = s + (e - s) / 2;
            int speed = 0;

            for (int i : piles){
                speed += (i + mid - 1) / mid;
            }

            if(speed <= h){
                e = mid;
            }else {
                s= mid + 1;
            }
        }

        return s;
    }
}
