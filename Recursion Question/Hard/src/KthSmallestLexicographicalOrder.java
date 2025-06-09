import java.util.ArrayList;
import java.util.List;

public class KthSmallestLexicographicalOrder {
    public static void main(String[] args) {
        int n = 100;
        int k = 10;
        System.out.println(findKthNumber(n , k));
    }

    public static int findKthNumber(int n , int k){
        int curr = 1;
        k--; // we start with 1 so one number is minus

        while (k > 0){
            int count = Count(curr , curr + 1 , n);
            if(count <= k){
                curr++;
                k -= count;
            }else{
                curr *= 10;
                k -= 1;
            }
        }
        return curr;
    }

    public static int Count(long curr , long next , int n){
        int countNum = 0;
        while(curr <= n){
            countNum += (next - curr);

            curr *= 10;
            next *= 10;

            next = Math.min(next , (long)n + 1);
        }
        return countNum;
    }

}
