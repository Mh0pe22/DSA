public class MakeTwoIntegerEqual {
    public static void main(String[] args) {
        int n = 13;
        int k = 4;
        System.out.println(minChange(n,k));
    }

    public static int minChange(int n ,int k){
      if((n | k) != n){
          return -1;
      }

      int diff = n ^ k;

      return Integer.bitCount(diff);
    }
}
