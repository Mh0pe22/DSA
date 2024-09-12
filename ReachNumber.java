public class ReachNumber {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(reachNumber(n));
    }

    public static int reachNumber(int target){
        target = Math.abs(target);
        int step = 0;
        int sum = 0;

        while (sum < target || (sum - target) % 2 != 0){
            step++;
            sum += step;
        }

        return step;
    }

}
