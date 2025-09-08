import java.util.Arrays;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        int n = 1010;
        System.out.println(Arrays.toString(getNoZerosIntegers(n)));
    }

    public static boolean isNumNonZero(int num){

        int temp = num;
        while(temp > 0){
            int n = temp % 10;
            if(n == 0){
                return false;
            }
            temp /= 10;
        }

        return true;
    }
    public static int[] getNoZerosIntegers(int n){
        for (int i = 1; i < n; i++) {
            if (isNumNonZero(i)){
               int num = n - i;
               if(isNumNonZero(num)){
                   return new int[]{i , n-i};
               }
            }
        }

        return new int[]{-1 , -1};
    }
}
