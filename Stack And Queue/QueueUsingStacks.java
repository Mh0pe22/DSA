import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void insert(int item){
        first.push(item);
    }

    public int remove(){

        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int top(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peaked = second.peek();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return peaked;
    }

    public static void main(String[] args) {
        QueueUsingStacks s = new QueueUsingStacks();
        s.insert(11);
        s.insert(22);
        s.insert(33);
        s.insert(44);

//        System.out.println(s.display());
    }
}
