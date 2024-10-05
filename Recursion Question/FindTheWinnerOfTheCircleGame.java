public class FindTheWinnerOfTheCircleGame {
    public static void main(String[] args) {
        int n =5;
        int k =2;
        System.out.println(findTheWinner(n , k));
    }

    public static int findTheWinner(int n, int k) {
        return helper(n, k) + 1;
    }

    public static int helper(int n, int k){
        if(n == 1){
            return 0;
        }

        return (helper(n - 1, k) + k) % n;
    }

}
