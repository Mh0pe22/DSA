public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3,0,1,4};
        System.out.println("Missing element is "+findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr){

        int i = 0;
        while(i < arr.length){

            int start = arr[i];
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, i, start);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }

        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
