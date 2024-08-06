import java.util.Arrays;

public class SumZero {

    public static void main(String[] args) {

        int n =5;
        System.out.println(Arrays.toString(uniqueNumber(n)));
    }

    static int[] uniqueNumber(int n){

        int[] ans = new int[n];
        int j = 0;
        int k = 1;
        int mid = n /2;
        for (int i = mid; i < n; i++) {
            if((n&1) == 1){
                ans[i] = j;
                j++;
            }else{
                ans[i] = k;
                k++;
            }
        }

        int len = mid;
        for (int i = 0; i < len; i++) {
            if((n & 1)==1){
                ans[i] = -ans[mid + 1];
                mid++;

            }else{
                ans[i] = -ans[mid];
                mid++;
            }
        }

        return ans;
    }
}
