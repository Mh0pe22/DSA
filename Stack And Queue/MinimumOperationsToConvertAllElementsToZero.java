import java.util.Stack;

public class MinimumOperationsToConvertAllElementsToZero {
    public static void main(String[] args) {
        int[] nums = {3 ,1 , 2 , 1};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();

        for(int num : nums){
            while(!st.isEmpty() && st.peek() > num){
                st.pop();
            }

            if(num > 0 && (st.isEmpty() || st.peek() < num)){
                ans++;
                st.add(num);
            }
        }

        return ans;
    }
}
