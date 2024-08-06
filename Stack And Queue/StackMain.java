public class StackMain {
    public static void main(String[] args) throws StackException {

        CustomStack stack = new CustomStack();

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peak());
    }
}
