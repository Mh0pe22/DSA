import java.util.Arrays;

//Every number that you have double has same number pof set bits

public class NumberOfDigits {

    public static void main(String[] args) {

//        int n = 10;
//        int b = 2;
//        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
//        System.out.println(ans);
        System.out.println(Arrays.toString(countBits3(4)));
    }

//    int[] an;
//    public int[] countBits0(int n) {
//
//        an = new int [n + 1];
//        dp(1, 1, n);
//        return an;
//    }
//    public void dp(int count, int i, int n){
//        if(i>n){
//            return;
//        }
//        an[i] = count;
//        dp(count, 2*i, n);
//        dp(count + 1, 2*i + 1, n);
//    }
    static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for(int i = 1; i <= n; i++){

            ans[i] = bit(i);
        }
        return  ans;
    }

    static int[] countBits3(int n){
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for(int i = 1; i <= n; i++){

            ans[i] = ans[i & (i - 1)] + 1;
        }
        return  ans;
    }

    static int bit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    static int[] countBits2(int n){
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n ; i++) {

            if(i%2 == 0 || i%7 == 0){
                if(i%3 == 0 || i%5 ==0){
                    ans[i] = 2;
                } else if (i % 7 == 0) {
                    ans[i] = 3;
                }
                ans[i] = 1;
            }
            ans[i] = bit(i);

        }

        return ans;
    }
}
