import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1 , 2,3};
        System.out.println(subSets(nums));
    }

    public static List<List<Integer>> subSets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        helper(0 , ans, temp , nums);

        return ans;
    }

    private static void helper(int idx , List<List<Integer>> ans ,List<Integer> temp , int[] nums){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        helper(idx + 1 , ans , temp , nums);
        temp.removeLast();
        helper(idx + 1 , ans, temp , nums);
    }
}
