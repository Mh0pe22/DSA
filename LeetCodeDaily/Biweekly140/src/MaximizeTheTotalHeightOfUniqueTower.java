import java.util.Arrays;
import java.util.Stack;

public class MaximizeTheTotalHeightOfUniqueTower {

    public static void main(String[] args) {
        int[] arr = {6,6,6,3,7,2,6,5};
        System.out.println(maximumTotals(arr));

    }

    public static int maximumTotals(int[] maximumHeight){
        Arrays.sort(maximumHeight);
        if(maximumHeight.length == 1){
            return maximumHeight[0];
        }

        int sum = 0;
        int previousHeight = Integer.MAX_VALUE;

        for (int i = maximumHeight.length - 1; i >= 0; i--) {
            int currentHeight = Math.min(maximumHeight[i], previousHeight - 1);


            if (currentHeight <= 0) {
                return -1;
            }

            sum += currentHeight;
            previousHeight = currentHeight;
        }
        return sum;
    }
}
