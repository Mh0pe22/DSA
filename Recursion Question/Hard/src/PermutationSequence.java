import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        System.out.println(getPermutation(n , k));
    }

    public static String getPermutation(int n ,int k){
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }

        numbers.add(n);
        StringBuilder ans = new StringBuilder();
        k -= 1;

        while(true){
            ans.append(numbers.get(k / fact));
            numbers.remove(k / fact);

            if(numbers.isEmpty()){
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }

        return ans.toString();
    }
}
