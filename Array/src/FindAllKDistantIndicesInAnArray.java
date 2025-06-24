import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,4,9,1,3,9,5};
        int key = 9;
        int k =1;
        System.out.println(findKDistantIndices(nums , key , k));
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> targetIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key)
                targetIndex.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            while(index < targetIndex.size()){
                int diff = Math.abs(i - targetIndex.get(index));
                if(diff <= k){
                    ans.add(i);
                    break;
                }
                index++;
            }
        }

        return ans;
    }
}
