public class HighestAltitude {

    public static void main(String[] args) {

        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] arr){

        int[] ans = new int[arr.length + 1];
        ans[0] = 0;
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {

            ans[i + 1] = arr[i] + ans[i];
            if(ans[i] < ans[i + 1]){
                if(ans[i + 1] > max) {
                    max = ans[i + 1];
                }
            }
        }
        return max;
    }
}
