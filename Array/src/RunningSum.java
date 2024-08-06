import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(Arrays.toString(sum(arr)));
    }

    public static int[] sum(int[] arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            temp += arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
