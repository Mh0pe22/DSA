import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {2,3};
        System.out.println(Arrays.toString(fairCandySwap(arr1 , arr2)));
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = Arrays.stream(aliceSizes).sum();
        int sumBob = Arrays.stream(bobSizes).sum();
        int delta = (sumAlice - sumBob) / 2;

        Set<Integer> setAlice = new HashSet<>();
        for (int size : aliceSizes) {
            setAlice.add(size);
        }

        for (int size : bobSizes) {
            if (setAlice.contains(size + delta)) {
                return new int[]{size + delta, size};
            }
        }

        return new int[0];
    }

//    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
//
//        int sum1 = sum(aliceSizes);
//        int sum2 = sum(bobSizes);
//        int s1 = 0, s2 = 0;
//        int e1 = aliceSizes.length - 1 , e2 = bobSizes.length - 1;
//
//        if(sum1 == sum2){
//            return new int[]{0,0};
//        }
//
//        int alice = 0;
//        int bob = 0;
//
//        while(s1 <= e1 && s2 <= e2){
//            int mid1 = s1 + (e1 - s1) / 2;
//            int mid2 = s2 + (e2 - s2) / 2;
//
//            alice = sum1 + bobSizes[mid2] - aliceSizes[mid1];
//            bob =  sum2 + aliceSizes[mid1] - bobSizes[mid2];
//            if(alice == bob){
//                return new int[]{aliceSizes[mid1] , bobSizes[mid2]};
//            }
//
//            if(alice < bob){
//                e1 = mid1 + 1;
//                s2++;
//            }else{
//                e2 = mid2 + 1;
//                s1++;
//            }
//        }
//
//        return new int[]{sum1 , sum2};
//    }
//
//    public static int sum(int[] arr){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length ; j++) {
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        for (int j : arr){
//            sum += j;
//        }
//
//        return sum;
//    }
}
