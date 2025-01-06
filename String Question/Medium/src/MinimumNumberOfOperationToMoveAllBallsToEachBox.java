package Medium.src;

import java.util.Arrays;

public class MinimumNumberOfOperationToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(Arrays.toString(minOperation(s)));
    }

    public static int[] minOperation(String s){
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length() ; j++) {
                if(s.charAt(j) == '1'){
                    count += Math.abs(j - i);
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
