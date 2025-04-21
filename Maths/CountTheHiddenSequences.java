public class CountTheHiddenSequences {
    public static void main(String[] args) {
        int[] differences = {1 , -3 , 4};
        int lower = 1;
        int upper = 6;
        System.out.println(numOfArrays(differences , lower , upper));
    }

    public static int numOfArrays(int[] differences, int lower , int upper ){
        int curr = 0;
        int maxVal = 0;
        int minVal  = 0;

        for(int diff : differences){

            curr = curr + diff;

            minVal = Math.min(minVal , curr);
            maxVal = Math.max(maxVal , curr);

            if((upper - maxVal) - (lower - minVal) + 1 <= 0){
                return 0;
            }
        }

        return (upper - maxVal) - (lower - minVal) + 1;
    }
}
