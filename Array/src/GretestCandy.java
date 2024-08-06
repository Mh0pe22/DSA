import java.util.ArrayList;
import java.util.List;

public class GretestCandy {

    public static void main(String[] args) {
        int[] arr ={2,3,5,1,3};
        int extraCandy = 3;
        System.out.println(kidsWithGreatestCandy(arr , extraCandy));
    }

    static List<Boolean> kidsWithGreatestCandy(int[] arr , int extraCandy){

        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for(int i : arr){
            ans.add((i + extraCandy) >= max);
        }
        return ans;
    }
}
