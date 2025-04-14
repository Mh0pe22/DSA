public class CountGoodTriplet {
    public static void main(String[] args) {
        int[] arr= {3,0,1,1,9,7};
        int a = 7 ;
        int b = 2;
        int c = 3;
        System.out.println(countGoodTriplet(arr , a, b , c));
    }

    public static int countGoodTriplet(int[] arr , int a , int b , int c){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2 ; i++) {

            for (int j = i + 1; j < n ; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < n; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
