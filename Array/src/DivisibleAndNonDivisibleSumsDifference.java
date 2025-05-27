public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSum(n , m));
    }

    public static int differenceOfSum(int n , int m){
        int num2 = 0;

        for (int i = m; i <= n ; i += m) {
            num2 += i;
        }
        int totalSum = (n * (n + 1)) / 2;
        int num1 = totalSum - num2;

        return num1 - num2;
    }
}
