import java.util.ArrayList;
import java.util.Arrays;

public class MaxPossibleScore {
    public static void main(String[] args) {
        int[] start = {6 , 0, 3};
        int d  = 2;

        System.out.println(maxPossibleScore(start , d));
    }

    public static int maxPossibleScore(int[] start , int d){
       long s = 0;
       long e = (long)1e12;
       int ans  =0;

       Arrays.sort(start);
       while(s <= e){
            long p = start[0];
            long m = s + (e - s) / 2;
            boolean ok = true;

           for (int i = 1; i < start.length; i++) {
               if(p + m >= start[i] && p + m <= start[i] + d){
                   p += m;
               } else if (p + m < start[i]) {
                   p = start[i];
               }else {
                   ok = false;
                   break;
               }
           }

           if(ok){
               ans = (int)m;
               s = m + 1;
           }else {
               e = m - 1;
           }
       }

       return ans;

    }




}
