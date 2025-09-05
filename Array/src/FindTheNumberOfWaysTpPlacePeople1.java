import java.util.Arrays;

public class FindTheNumberOfWaysTpPlacePeople1 {
    public static void main(String[] args) {
        int[][] points = {
                {1, 1},
                {2, 2},
                {3, 3}
        };

        System.out.println(numberOfPairs(points));
    }

    public static int numberOfPairs(int[][] points){
        Arrays.sort(points , (a , b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int count = 0;

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            int bound = Integer.MIN_VALUE;
            int top = y1;

            for (int j = i + 1; j < points.length ; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                if(y2 <=top && y2 > bound){
                    count++;
                    bound = y2;

                    if(y2 == top){
                        top--;
                    }
                }
            }
        }

        return count;
    }
}
