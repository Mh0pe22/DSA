import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public static void main(String[] args) {
        int limit = 4;
        int[][] queries = {
                {1,4},
                {2,5},
                {1,3},
                {3,4}
        };

        System.out.println(Arrays.toString(queryResults(limit , queries)));
    }

    public static int[] queryResults(int limit , int[][] queries){
        Map<Integer , Integer> colormap = new HashMap<>(); // color -> count
        Map<Integer , Integer> ballmap = new HashMap<>(); // ball -> color

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballmap.containsKey(ball)){
                int prevColor = ballmap.get(ball);
                colormap.put(prevColor , colormap.get(prevColor) - 1);

                if(colormap.get(prevColor) == 0){
                    colormap.remove(prevColor);
                }
            }

            ballmap.put(ball , color);
            colormap.put(color , colormap.getOrDefault(color , 0) + 1);

            ans[i] = colormap.size();
        }

        return ans;
    }
}
