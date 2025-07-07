import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {
    public static <String> void main(String[] args) {
        int[][] nums1 = {
                {1 , 2},
                {2, 4},
                {5, 1}
        };

        int[][] nums2 = {
                {1 , 4},
                {2, 8},
                {4, 7}
        };

        int[][] ans = mergeArrays(nums1 , nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[][] mergeArrays(int[][] nums1 , int[][] nums2){
        List<int[]> ans = new ArrayList<>();

        int m = nums1.length;
        int n = nums2.length;

        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(nums1[i][0] < nums2[j][0]){
                ans.add(nums1[i]);
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                ans.add(nums2[j]);
                j++;
            }else{
                ans.add(new int[]{nums1[i][0] , nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }

        while (i < m){
            ans.add(nums1[i]);
            i++;
        }

        while (j < n){
            ans.add(nums2[j]);
            j++;
        }

        return ans.toArray(new int[0][]);
    }
}
