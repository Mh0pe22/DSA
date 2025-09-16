import java.util.ArrayList;
import java.util.List;

public class ReplaceNonCoprimeNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,7,6,2};

        System.out.println(replaceNonCoprime(nums));
    }

    public static List<Integer> replaceNonCoprime(int[] nums){

        List<Integer> ans = new ArrayList<>();

        for(int num : nums){
            while(!ans.isEmpty()){
                int prev = ans.getLast();
                int curr = num;

                int gcd = GCD(Math.max(prev  , curr) , Math.min(prev , curr));
                if(gcd == 1){
                    break;
                }

                ans.removeLast();
                int lcm = (prev / gcd) * curr;

                num = lcm;
            }

            ans.add(num);
        }

        return ans;
    }

    public static int GCD(int num1 , int num2){
        if(num2 == 0){
            return num1;
        }

        return GCD(num2 , num1 % num2);
    }
}
