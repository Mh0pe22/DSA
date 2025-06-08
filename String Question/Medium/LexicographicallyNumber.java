package Medium;

import java.util.ArrayList;
import java.util.List;

public class LexicographicallyNumber {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    public static List<Integer> lexicalOrder(int n){
        List<Integer> ans =  new ArrayList<>();
        for (int startWith = 1; startWith <= 9; startWith++) {
            solve(startWith , n , ans);
        }
        return ans;
    }

    public static void solve(int curr , int n , List<Integer> ans){
        if(curr > n){
            return;
        }
        ans.add(curr);

        for (int append = 0; append <= 9; append++) {
            int newNum = (curr * 10) + append;

            if(newNum > n){
                return;
            }
            solve(newNum , n , ans);
        }

    }
}
