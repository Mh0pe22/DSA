public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(median(arr1,arr2));
    }

    public static double median(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int left = (n1 + n2 + 1) / 2;

        if(n1 >  n2 ){
            return median(arr2 ,arr1);
        }

        int s = 0;
        int e = n1;

        int n = n1 + n2;

        while (s <= e){
            int mid1 = s + (e- s) / 2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE , l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE , r2 = Integer.MAX_VALUE;
            if(mid1 < n1){
                r1 = arr1[mid1];
            }

            if(mid2 < n2){
                r2 = arr2[mid2];
            }

            if(mid1 - 1 >= 0){
                l1 = arr1[mid1 - 1];
            }

            if(mid2 - 1 >= 0){
                l2 = arr2[mid2 - 1];
            }

            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 1){
                    return Math.max(l1,l2);
                }else {
                    return ((double) (Math.max(l1,l2) + Math.min(r1,r2))) / 2.0;
                }
            } else if (l1 > r2) {
                e = mid1 - 1;
            }else {
                s = mid1 + 1;
            }

        }
        return 0;
    }
}
