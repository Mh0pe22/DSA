import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr ={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int [] arr){
        StringBuilder a = new StringBuilder();
        for (int j : arr) {
            a.append(j);
        }
        BigInteger m = new BigInteger(a.toString());
        m = m.add(BigInteger.ONE);
         String s = m.toString();

        int[] ans = new int[s.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Character.getNumericValue(s.charAt(i));
        }
        return ans;
    }
}
