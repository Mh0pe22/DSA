import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr= {5,10,-5};
        System.out.println(Arrays.toString(collision(arr)));
    }

    public static int[] collision(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(i > 0){
                stack.push(i);
            }else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)){
                    stack.pop();
                }

                if(!stack.isEmpty() && stack.peek() == Math.abs(i)){
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
