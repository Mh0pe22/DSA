public class MaxValueOfEquation {

    public static void main(String[] args) {

        int[][] points = {
                {-19,9},
                {-15,-19},
                {-5,-8}
        };
        int k =10;
        System.out.println(findMaxValueOfEquation(points , k));
    }

    public static int findMaxValueOfEquation(int[][] points , int k){

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            int j = i + 1;
            while(j < points.length){
                int absVal = Math.abs(points[i][0] - points[j][0]);
                if(absVal <= k){
                    int ansTemp= points[i][1] + points[j][1] + absVal;
                    if(ansTemp > ans){
                        ans = ansTemp;
                    }

                }
                j++;
            }
        }

//        int max = ans[0];
//        for (int i = 0; i < index; i++) {
//            if(ans[i] > max){
//                max =ans[i];
//            }
//        }
        return ans;
    }
}
