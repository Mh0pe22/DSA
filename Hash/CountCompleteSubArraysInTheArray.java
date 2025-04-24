import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountCompleteSubArraysInTheArray {
    public static void main(String[] args) {
        int[] nums = {1 ,3 ,1 , 2, 2};
        System.out.println(countCompleteSubArrays(nums));
    }

    public static int countCompleteSubArrays(int[] nums){
        int i = 0;
        int j = 0;
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }

        int unique  = st.size();
        HashMap<Integer , Integer> mp = new HashMap<>();
        int res = 0;

        while (j < n){
            mp.put(nums[j] , mp.getOrDefault(nums[j] , 0) + 1);

            while (unique == mp.size()){
                res += (n - j);

                mp.put(nums[i] , mp.get(nums[i]) - 1);
                if(mp.get(nums[i]) == 0){
                    mp.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
