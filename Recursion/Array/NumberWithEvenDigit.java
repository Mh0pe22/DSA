package Array;

public class NumberWithEvenDigit {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(EvenDigit(arr));
    }

    static int EvenDigit(int[] arr){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toString(arr[i]);
            if((s.length() % 2) == 0){
                count++;
            }
        }

        return count;
    }
}
