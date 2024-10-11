import java.util.ArrayList;
import java.util.List;

public class SumCombination3 {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        List<List<Integer>> ans = combinationSum3(k , n);

        for(List i : ans){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> combinationSum3(int k ,int n){
        List<List<Integer>> ans = new ArrayList<>();
        solve(1 , k , n , new ArrayList<>() , ans);

        return ans;
    }

    public static void solve(int index , int k ,int n , List<Integer> curr , List<List<Integer>> ans){

        if(k == 0 && n == 0){
            ans.add(curr);
            return;
        }

        if(index > 9 || n < 0 || k < 0){
            return;
        }

        List<Integer> temp = new ArrayList<>(curr);
        temp.add(index);
        solve(index + 1 , k - 1 , n - index , temp , ans);

        solve(index + 1 , k , n , curr , ans);
    }
}
