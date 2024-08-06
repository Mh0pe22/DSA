import java.util.Arrays;

public class SmallerThenCurrent {

    public static void main(String[] args) {

        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerThanCurrent(arr)));
    }

    static int[] smallerThanCurrent(int[] arr){

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]){
                    ans[i]++;
                }else {
                    if(arr[i] != arr[j]) {
                        ans[j]++;
                    }
                }
            }
        }
        return ans;
    }
}
