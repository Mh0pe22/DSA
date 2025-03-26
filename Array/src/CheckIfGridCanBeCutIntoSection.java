import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfGridCanBeCutIntoSection {
    public static void main(String[] args) {
        int n =5;
        int[][] intervals = {
                {1,0,5,2},
                {0,2,2,4},

                {3,2,5,3},
                {0,4,4,5}
        };

        System.out.println(checkValidCuts(n , intervals));
    }

    public static int[][] merge(int[][] intervals){
        int n = intervals.length;

        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        List<int[]> ans= new ArrayList<>();
        ans.add(intervals[0]);
        for (int i = 1; i < n; i++) {
            if(intervals[i][0] < ans.getLast()[1]){
                ans.getLast()[1] = Math.max(intervals[i][1] , ans.getLast()[1]);
            }else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static boolean checkValidCuts(int n , int[][] rectangles){
        List<int[]> hor = new ArrayList<>();
        List<int[]> ver = new ArrayList<>();

        for(int[] i : rectangles){
            int x1 = i[0];
            int y1 = i[1];
            int x2 = i[2];
            int y2 = i[3];

            hor.add(new int[]{x1 , x2});
            ver.add(new int[]{y1 , y2});
        }

        int[][] horArray = hor.toArray(new int[hor.size()][]);
        int[][] verArray = ver.toArray(new int[ver.size()][]);

        int[][] result1 = merge(horArray);
        if(result1.length >= 3){
            return true;
        }
        int[][] result2 = merge(verArray);

        return result2.length >= 3;

    }
}
