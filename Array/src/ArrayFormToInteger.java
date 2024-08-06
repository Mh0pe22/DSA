import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormToInteger {

    public static void main(String[] args) {

        int[] arr = {9,9,9,9,9,9};
        int k = 1;

        System.out.println(arrayToInteger(arr , k));
    }

    static List<Integer> arrayToInteger(int[] arr , int k){

//        BigInteger sum = BigInteger.valueOf(k);
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length ; i++) {
//                sum =  sum.add(BigInteger.valueOf(arr[arr.length - 1 - i]) . multiply(BigInteger.TEN.pow(i)));
//        }
//
//        while(sum.compareTo(BigInteger.ZERO) > 0){
//           BigInteger[] divmod = sum.divideAndRemainder(BigInteger.TEN);
//           ans.add(divmod[1].intValue());
//           sum = divmod[0];
//        }


        StringBuilder sum = new StringBuilder();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            sum = sum.append(arr[i]);
        }

        sum.reverse();
        sum = new StringBuilder(new BigInteger(sum.toString()).add(BigInteger.valueOf(k)).toString());

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < sum.length(); i++) {
            ans.add(sum.charAt(i) - '0');
        }
        ans.reversed();
        return ans;
    }
}
