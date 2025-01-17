public class NeighboringBitwiseXOR {
    public static void main(String[] args) {
        int[] derived = {1,1,0};
        System.out.println(doesValidArrayExist(derived));
    }

    public static boolean doesValidArrayExist(int[] derived){

        // First approach
        /*
        int n = derived.length;
        int[] original = new int[derived.length];
        original[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            original[i + 1] = original[i] ^ derived[i];
        }

        if(derived[n - 1] == (original[0] ^ original[n - 1])){
            return true;
        }

        original[0] = 1;
        for (int i = 0; i < n - 1; i++) {
            original[i + 1] = original[i] ^ derived[i];
        }

        if(derived[n - 1] == (original[0] ^ original[n - 1])){
            return true;
        }

        return false;

         */

        // second approach
        int XOR = 0;
        for(int i : derived){
            XOR ^= i;
        }

        return XOR == 0;
    }
}
