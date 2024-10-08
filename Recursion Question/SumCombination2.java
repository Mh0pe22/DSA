import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumCombination2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(arr ,target);
        for(List i : ans){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates , int target){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0 , candidates , target , ans , new ArrayList<>());

        return ans;
    }

    public static void findCombinations(int index , int[] arr , int target , List<List<Integer>> ans , List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if(i > index && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > target){
                break;
            }

            ds.add(arr[i]);
            findCombinations(i + 1, arr , target - arr[i] , ans , ds);
            ds.removeLast();
        }
    }
}
