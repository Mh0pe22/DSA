public class LargestCombinationWithBitwiseAndGreaterThanZero {
    public static void main(String[] args) {

        int[] arr = {16,17,71,62,12,24,14};
        System.out.println(largestCombination(arr));
    }

    public static int largestCombination(int[] candidates){

        int result = 0;

        for (int i = 0; i < 24; i++) {

            int count_ith = 0;

            for(int num : candidates){
                if((num & (1 << i)) != 0){
                    count_ith ++;
                }
            }

            result = Math.max(result , count_ith);
        }

        return result;
    }
}
