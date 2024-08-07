import java.util.Stack;

public class LargestHeightHistoGram {

    public static void main(String[] args) {

        int[] height = {2,1,5,6,2,3};
        System.out.println(largestHeight(height));
    }

    public static int largestHeight(int[] height){

        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);
        for (int i = 1; i <height.length ; i++) {
            while(!stack.isEmpty() && height[i] < height[stack.peek()]){
                max = getMax(height , stack, max , i);
            }

            stack.push(i);
        }

        int i= height.length;
        while(!stack.isEmpty()){
            max = getMax(height , stack , max , i);
        }

        return max;
    }

    private static int getMax(int[] height , Stack<Integer> stack, int max , int i){
        int area;
        int popped = stack.pop();

        if(stack.isEmpty()){
            area = height[popped] * i;
        }else{
            area = height[popped] * (i - 1 - stack.peek());
        }

        return Math.max(area, max);
    }
}
