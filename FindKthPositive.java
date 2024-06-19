public class FindKthPositive {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    public static int findKthPositive(int[] arr , int k){
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] - (mid + 1) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left + k;
    }

//    public static int findKthPositive(int[] arr , int k){
//
//        int s = 0;
//        int e = arr.length - 1;
//        int count = 0;
//        while(s <= e){
//            int mid = s + (e - s) / 2;
//
//            if(arr[mid] == k){
//                if(mid + 1 == k) {
//                    return arr[arr.length - 1] + k;
//                }
//            }
//
//            if (arr[mid] < k) {
//                s = mid + 1;
//                count++;
//            }else{
//                e = mid - 1;
//                count ++;
//            }
//        }
//
//        if(arr[s] > k){
//            if(arr[s] - k < k && arr.length > 2) {
//                return arr[s] + count;
//            }
//        }
//     return arr[s] - count;
//    }
}
