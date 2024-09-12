public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr , 0 , arr.length - 1));
    }

    public static int singleElement(int[] arr , int s , int e){

        if(s == e){
            return arr[s];
        }
        int mid = s + (e - s) / 2;

        if(mid == 0 || mid == arr.length - 1){
            if (mid == 0 && arr[mid + 1] != arr[mid]){
                return arr[mid];
            }

            if(mid == arr.length - 1 && arr[mid] != arr[mid - 1]){
                return arr[mid];
            }

        }

        if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
            return arr[mid];
        }

        if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
            return singleElement(arr, mid + 1, e);
        } else {
            return singleElement(arr, s, mid - 1);
        }

    }
}
