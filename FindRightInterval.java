import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args) {

        int[][] arr = {
                {4,5},
                {2,5},
                {6,7}
        };

        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    public static int[] findRightInterval(int[][] arr){

        if(arr.length == 1){
            if(arr[0][0] >= arr[0][1]){
                return new int[]{0};
            }else {
                return new int[]{-1};
            }
        }
        int[] ans = new int [arr.length];
        Arrays.fill(ans,-1);

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = arr.length - 1;
            while (s <= e){
                int mid = s + (e - s) / 2;

                if( arr[i][1] <= arr[mid][0]){
                    ans[i] = mid;
                    if(mid != 0 && arr[i][1] < arr[mid][0]) {
                        e = mid - 1;
                    }else {
                        break;
                    }
                } else if(arr[mid][0] < arr[s][0] && arr[mid][0] > arr[e][0]){
                    e =mid - 1;
                }else {
                    s = mid + 1;
                }
            }

        }

        return ans;
    }
}
