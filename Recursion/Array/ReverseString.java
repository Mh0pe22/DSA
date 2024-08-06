package Array;

public class ReverseString {

    public static void main(String[] args) {

       char[] s = {'h' , 'e' , 'l', 'l', 'o'};
       reverse2(s , 0 , 4);
        System.out.println(s);
    }

    static void reverse(char[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap arr[left] and arr[right]
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move left and right pointers towards the center
            left++;
            right--;
        }

        System.out.println(arr);
    }
    static void reverse2(char[] arr , int start , int end){
        if( start == end ){
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start ++;
        end--;
        reverse2(arr , start , end);
    }
}
