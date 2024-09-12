import java.util.*;

public class CountSmallerNumberAfterSelf {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(countSmaller(arr));
    }

    public static List<Integer> countSmaller(int[] arr){
        List<Integer> ans = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = arr.length - 1;i >= 0 ; i--) {
            int position = insertPosition(sortedList , arr[i]);
            ans.add(position);
            sortedList.add(position , arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static int insertPosition(List<Integer> sortedList , int target){
        int s = 0;
        int e = sortedList.size();

        while (s < e){
            int mid = s + (e - s) / 2;
            if(sortedList.get(mid) >= target){
                e = mid;
            }else {
                s = mid  + 1;
            }
        }
        return s;
    }
}
