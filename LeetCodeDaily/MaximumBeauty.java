import java.util.Arrays;

public class MaximumBeauty {
    public static void main(String[] args) {

    }

    public static int[] maximumBeauty(int[][] items , int[] queries){
        int maxBeauty = items[0][1];
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i =  1; i < items.length ; i++) {

            maxBeauty = Math.max(maxBeauty , items[i][1]);
            items[i][1] = maxBeauty;
        }

        int[] ans = new int[queries.length];



        for (int i = 0; i < queries.length; i++) {
            int queryPrice = queries[i];
            ans[i] = binary(items , queryPrice);
        }

        return ans;
    }

    public static int binary(int[][] items , int queryPrice){
        int maxBeauty = 0;

        int l = 0;
        int r = items.length - 1;

        while (l <= r){
            int mid = l + (r - l) / 2;

            if(items[mid][0] > queryPrice){
                r = mid - 1;
            }else {
                maxBeauty = Math.max(maxBeauty , items[mid][1]);
                l = mid + 1;
            }
        }

        return maxBeauty;
    }
}
