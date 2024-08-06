public class PowOfTwo {

    public static void main(String[] args) {

        int n = 8;
        boolean ans = (n & (n -1)) == 0;
        if(ans && (n != 0)){
            System.out.println(ans);
        }else{
            System.out.println(false);
        }
    }
}
