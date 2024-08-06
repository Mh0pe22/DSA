public class MinCost {

    public static void main(String[] args) {

        int[] position= {1,2,3};
        System.out.println(minCost(position));
    }

    static int minCost(int[] position){

        int odd = 0;
        int even = 0;
        for (int j : position) {
            if ((j & 1) == 1) {
                odd += 1;
            }else {
                even += 1;
            }
        }

        return Math.min(odd ,even);
    }
}
