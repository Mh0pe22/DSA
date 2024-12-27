public class BestSightSeeingPair {
    public static void main(String[] args) {
        int[] arr = {7,8,8,10};
        System.out.println(maxScoreSightseeingPair(arr));
    }

    public static int maxScoreSightseeingPair(int[] values){

        if(values.length == 2){
            return values[0] + values[1] - 1;
        }

        int maxEle = values[0] + 0;
        int maxVal = 0;
        for (int j = 1; j < values.length; j++) {

            maxVal = Math.max(maxVal, maxEle + values[j] - j);

            maxEle = Math.max(maxEle, values[j] + j);

        }

        return maxVal;
    }
}
