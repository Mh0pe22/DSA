import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] nums = {1 ,2 ,3, 4, 3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0 ; i--) {
            st.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {

            int curr = nums[i];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }

            nums[i] = st.isEmpty() ? -1 : st.peek();
            st.push(curr);
        }

        return nums;
    }
}
