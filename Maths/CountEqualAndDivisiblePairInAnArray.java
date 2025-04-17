import java.util.*;

public class CountEqualAndDivisiblePairInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums, k));
    }

    public static int countPairs(int[] nums , int k){
        int n = nums.length;
        int result = 0;

        HashMap<Integer , List<Integer>> indicesMap =  new HashMap<>();
        for (int i = 0; i < n; i++) {
            indicesMap.computeIfAbsent(nums[i] , a -> new ArrayList<>()).add(i);
        }

        Set<Integer> div = new HashSet<>();
        for (int i = 1; i * i <= k ; i++) {
            if(k % i == 0){
                div.add(i);
                div.add(k / i);
            }
        }

        for(Map.Entry<Integer, List<Integer>> entry : indicesMap.entrySet()){
            List<Integer> indices = entry.getValue();
            HashMap<Integer , Integer> factorsMap = new HashMap<>();

            for(int i : indices){
                int gcd = gcd(i , k);
                int j = k / gcd;
                result += factorsMap.getOrDefault(j , 0);

                for(int f : div){
                    if(i % f == 0){
                        factorsMap.put(f , factorsMap.getOrDefault(f , 0) + 1);
                    }
                }
            }
        }
        return result;
    }

    private static int gcd(int a , int b){
        while (b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
