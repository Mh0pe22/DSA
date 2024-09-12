import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        System.out.println(Arrays.toString(twoSum(arr, 5)));
    }

    public static int[] twoSum(int[] arr , int target){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length ; j++) {
                if(arr[i]+arr[j]== target)
                    return new int[] {i,j};
                if(arr[n-i-1]+ arr[n-j-1]== target)
                    return new int[] {n-i-1, n-j-1};
            }
        }
        return new int[]{-1,-1};
    }
}
