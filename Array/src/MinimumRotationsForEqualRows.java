public class MinimumRotationsForEqualRows {
    public static void main(String[] args) {

    }

    public static int minimumDominoRotations(int[] top , int[] bottom){
        int value = Integer.MAX_VALUE;

        for (int i = 1; i <= 6; i++) {
            int step = find(i , top , bottom);

            if(step != -1){
                value = Math.min(value , step);
            }
        }

        return value == Integer.MAX_VALUE ? -1 : value;
    }

    private static int find(int val , int[] top , int[] bottom){
        int topStep = 0;
        int bottomStep = 0;

        for (int i = 0; i < top.length; i++) {
            if(top[i] != val && bottom[i] != val){
                return -1;
            } else if (top[i] != val) {
                topStep++;
            }else if(bottom[i] != val){
                bottomStep++;
            }
        }

        return Math.min(topStep , bottomStep);
    }
}

