import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1 , nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int[] tempAns = new int[10001];

        for(int i = nums2.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }

            tempAns[nums2[i]] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = tempAns[nums1[i]];
        }

        return nums1;
    }
}
