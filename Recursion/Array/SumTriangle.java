package Array;

import java.util.Arrays;

public class SumTriangle {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        triangle(arr,1 );
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int[] arr, int loop){

        if(arr.length <= 1){
            return;
        }
        int[] ans = new int[arr.length - 1];
        for (int i = 0; i <ans.length ; i++) {

            int x = arr[i] + arr[i + 1];
            ans[i] = x;
        }

        loop++;

        triangle(ans , loop);
        System.out.println(Arrays.toString(ans));
    }
}
