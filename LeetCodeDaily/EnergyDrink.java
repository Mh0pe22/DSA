public class EnergyDrink {
    public static void main(String[] args) {
        int[] energyDrinkA1 = {4, 1, 1};
        int[] energyDrinkB1 = {1, 1, 3};
        System.out.println("Output: " + maxEnergyBoost(energyDrinkA1, energyDrinkB1));
    }

    public static long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;

        // Initialize dp arrays
        long[] dpA = new long[n];
        long[] dpB = new long[n];

        // Base cases
        dpA[0] = energyDrinkA[0];
        dpB[0] = energyDrinkB[0];

        // Fill the dp arrays
        for (int i = 1; i < n; i++) {
            dpA[i] = Math.max(dpA[i-1] + energyDrinkA[i], dpB[i-1]);  // Continue with A or switch from B
            dpB[i] = Math.max(dpB[i-1] + energyDrinkB[i], dpA[i-1]);  // Continue with B or switch from A
        }

        // The maximum energy boost will be the maximum of the last hour's values in both dpA and dpB
        return Math.max(dpA[n-1], dpB[n-1]);
    }
}
