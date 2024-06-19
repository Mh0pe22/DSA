public class RoundOfRoot {
    public static void main(String[] args) {

        int x = 2147395599;
        System.out.println(root(x));
    }

    public static int root(int x){

        if(x < 2){
            return x;
        }

        int ans = 0;
        long s = 0;
        long e = x / 2;
        while(s <= e){
            long mid = s + (e - s) / 2;
            long sqr = mid * mid;
            if(sqr == x){
                return (int)mid;
            } else if (sqr < x) {
                ans = (int)mid;
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }

        return ans;
    }
}
