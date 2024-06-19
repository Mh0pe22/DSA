import java.util.Arrays;

public class CheckIfExist {
    public static void main(String[] args) {

        int[]  arr = {2,5,3,10};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr){


        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            int e = arr.length - 1;

                while (s <= e) {
                    int mid = s + (e - s) / 2;
                    if(i != mid && arr[mid] == 2 * arr[i]){
                        return true;
                    }

                    if(arr[mid] > 2 * arr[i]){
                        e = mid - 1;
                    }else{
                        s = mid + 1;
                    }

            }
        }

        return false;
    }
}
