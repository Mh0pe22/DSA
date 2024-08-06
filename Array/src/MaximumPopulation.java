public class MaximumPopulation {

    public static void main(String[] args) {

        int[][] arr = {
                {1993,1999},
                {2000,2010}
        };

        System.out.println(maximumPopulationYear(arr));
    }

    public static int maximumPopulationYear(int[][] arr){

        int[] year = new int[101];
        // Increment for births and decrement for deaths
        for (int i = 0; i < arr.length; i++) {
            int birth = arr[i][0] - 1950;
            int death = arr[i][1] - 1950;
            year[birth] += 1;  // Increment the birth year
            if (death < 101) {
                year[death] -= 1;  // Decrement the death year
            }
        }

        // Compute the running sum to find the maximum population year
        int maxPop = year[0];
        int maxYear = 0;
        for (int i = 1; i < year.length; i++) {
            year[i] += year[i - 1]; // Running sum
            if (year[i] > maxPop) {
                maxPop = year[i];
                maxYear = i;
            }
        }

        return maxYear + 1950;
    }

}
