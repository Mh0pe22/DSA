import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {

        int[] arr= {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(targetArray(arr,index)));
    }

    public static int[] targetArray(int[] arr, int[] index){
//        int[] ans = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(ans[index[i]] != 0){
//                int j = arr[index[i]];
////                while(j != i + 1){
////                    int temp = ans[index[j]];
////                    ans[index[j]] = ans[index[j - 1]];
////                    j++;
////                }
//                int[] dup = new int[i - j];
//                for (int k = 0 ; k < (i - j) ; k++) {
//                    dup[k] = ans[j];
//                    j++;
//                }
//                ans[i] = arr[index[i]];
//                for (int k = 0; k < (i - j) ; k++) {
//                    ans[index[i]+ k] = dup[k];
//                }
//            }else {
//                ans[i] = arr[index[i]];
//            }
//        }
//        return ans;
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= index[i]; j--) {
                ans[j + 1] = ans[j]; // Shift elements to the right
            }
            ans[index[i]] = arr[i]; // Insert arr[i] at index[i]
        }

        return ans;
    }
}
