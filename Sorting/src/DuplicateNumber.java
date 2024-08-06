public class DuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {2,1,4,5,6,3};
        System.out.println(duplicateNumber(arr));
    }

    static int duplicateNumber(int[] arr){

        int i = 0;
        while (i < arr.length){

            if(arr[i] != i +1){
                int start = arr[i] -1;
                if(arr[i] != arr[start]){
                    swap(arr , i ,start);
                }else{
                    return arr[i];
                }
            }else {
                i ++;
            }

        }
        return -1;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
