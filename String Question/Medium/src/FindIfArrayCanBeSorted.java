package Medium.src;

public class FindIfArrayCanBeSorted {
    public static void main(String[] args) {
        int[] arr = {18,3,8};
        System.out.println(canSortArray(arr));
    }

    public static boolean canSortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] <= arr[j + 1]){
                    continue;
                }else {
                    if (Integer.bitCount(arr[j]) == Integer.bitCount(arr[j + 1])) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = arr[j];
                        swap = true;
                    }else {
                        return false;
                    }
                }
            }

            if(!swap){
                break;
            }
        }

        return true;
    }
}
