public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        int m =2;
        System.out.println(sum(arr,m));
    }

    static int sum(int[] arr,int m){

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start , arr[i]);
            end += arr[i];
        }

        while(start < end){

            int mid = start + (end - start)/2;

//         Calculate how many pieces you can divide this in with the max sum
            int sum = 0;
            int piece = 1;

            for(int num : arr){
                if(sum + num > mid){
                    sum = num;
                    piece++;
                }else {
                    sum += num;
                }
            }

            if(piece > m){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
