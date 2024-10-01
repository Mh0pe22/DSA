public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {999,19,199};
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] arr){

        int min = sum(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min , sum(arr[i]));
        }

        return min;
    }

   public static int sum(int n){

        int temp= n;
        int sum = 0;
        while(n > 0){
            temp %= 10;
            sum += temp;
            n /= 10;
            temp = n;
        }

        return sum;
   }
}
