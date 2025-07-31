import java.util.HashSet;

public class BitwiseOROfSubArray {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 4};
        System.out.println(subArrayBitwiseOr(arr));
    }

    public static int subArrayBitwiseOr(int[] arr){
        HashSet<Integer> prevOr = new HashSet<>();
        HashSet<Integer> distinctEle = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> currOr = new HashSet<>();
            currOr.add(arr[i]);
            distinctEle.add(arr[i]);
            for(Integer prev : prevOr){
                int or = (prev | arr[i]);
                currOr.add(or);
                distinctEle.add(or);
            }

            prevOr = currOr;
        }

        return distinctEle.size();
    }
}
