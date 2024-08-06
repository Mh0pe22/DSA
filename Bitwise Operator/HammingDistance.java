public class HammingDistance {

    public static void main(String[] args) {
        int x = 3;
        int  y =1;
        System.out.println(distance(x,y));
    }

    static int distance(int x ,int y){
        int count =0;
        while(x > 0 || y > 0){
            if((x &1) != (y & 1)){
                count++;
            }
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
