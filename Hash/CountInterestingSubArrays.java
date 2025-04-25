import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountInterestingSubArrays {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3 , 2, 4));
        int k = 1;
        int modulo = 2;
        System.out.println(countInterestingSubArrays(nums , k, modulo));
    }

    public static long countInterestingSubArrays(List<Integer> nums , int k , int module){
        long n = nums.size();
        long pos = 0;
        long interesting_subArrays = 0;
        long prefix_count = 0;

        HashMap<Long , Long> mod_freq = new HashMap<>();
        mod_freq.put(0L , 1L);
        while (pos < n){
            if(nums.get((int)pos) % module == k){
                prefix_count++;
            }

            prefix_count %= module;
            long key = (prefix_count - k + module) % module;
            if(mod_freq.containsKey(key)){
                interesting_subArrays += mod_freq.get(key);
            }

            mod_freq.put(prefix_count , mod_freq.getOrDefault(prefix_count , 0L) + 1);
            pos++;
        }
        return interesting_subArrays;
    }
}
