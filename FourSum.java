import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        List<List<Integer>> ans = fourSum(arr , 8);
        for(List<Integer> i : ans){
            System.out.print(i);
        }
    }

    public static List<List<Integer>> fourSum(int[] arr, int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if(i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j++) {

                if( j > i + 1 && arr[j] == arr[j - 1] ){
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k];
                    sum += arr[l];

                    if(sum == target){
                        ans.add(Arrays.asList(arr[i] , arr[j] , arr[k] , arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]){
                            k++;
                        }

                        while (k < l && arr[l] == arr[l + 1]){
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return ans;
    }

//    public static List<List<Integer>> fourSum(int[] arr , int target){
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if(i > 0 && arr[i] == arr[i - 1]) continue;
//            int j = i + 1;
//            while ( j > i + 1 && arr[j] == arr[j - 1] ){
//                j++;
//            }
//            while (j < arr.length - 1){
//
//                int k = j + 1;
//                int s = k;
//                int e = arr.length - 1;
//
//                long sum= arr[i] + arr[j];
//                sum += arr[s];
//                while (s < e){
//                    int mid = s + (e - s) / 2;
//
//                    if(sum + arr[mid] == target){
//                        ans.add(Arrays.asList(arr[i] , arr[j] , arr[k] , arr[mid]));
//                        k++;
//                        while (k < arr.length && arr[k] == arr[k - 1]){
//                            k++;
//                        }
//                    }
//                    if(sum + arr[mid] > target){
//                        e = mid - 1;
//                    }else {
//                        s = mid + 1;
//                    }
//                }
//                j++;
//            }
//        }
//
//        return ans;
//    }
}
