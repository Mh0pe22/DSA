package Medium.src;

import java.util.Arrays;

public class MinimumNumberOfOperationToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(Arrays.toString(minOperation(s)));
    }

//    public static int[] minOperation(String s){
//        int[] ans = new int[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < s.length() ; j++) {
//                if(s.charAt(j) == '1'){
//                    count += Math.abs(j - i);
//                }
//            }
//            ans[i] = count;
//        }
//        return ans;
//    }

   public static int[] minOperation(String boxes){
        int n = boxes.length();

        int cumValue = 0;
        int cumValueSum = 0;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = cumValueSum;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;

            cumValueSum += cumValue;
        }

        cumValue = 0;
        cumValueSum = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] += cumValueSum;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;

            cumValueSum += cumValue;
        }

        return ans;
    }
}
