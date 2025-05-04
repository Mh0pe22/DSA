import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {
    public static void main(String[] args) {
        int[][] dominoes = {
                {1 , 2},
                {1 , 2},
                {2 , 3},
                {2 , 1}
        };
        System.out.println(numEquivalentDominoPairs(dominoes));
    }

    public static int numEquivalentDominoPairs(int[][] dominoes){
        int result = 0;
        int[] arr = new int[100];

        for(int[] i : dominoes){
            if(i[0] > i[1]){
                int temp = i[0];
                i[0] = i[1];
                i[1] = temp;
            }

            int num = i[0] * 10 + i[1];

            result += arr[num];
            arr[num]++;
        }

        return result;

    }
}
