import java.util.Arrays;

public class GoodPairs {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1};
        System.out.println(identicalPairs(arr));
    }

    static int identicalPairs(int[] arr){

        if(arr.length == 0){
          return 0;
        }
        int pair = 0;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j <arr.length ; j++) {
//                if(arr[i] == arr [j] && i < j){
//                    pair++;
//                }
//            }
//        }

        Arrays.sort(arr);
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[j] && i < j){
                pair++;
            }
            j++;
        }

        return pair;
    }
}
