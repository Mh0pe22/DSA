public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    int ptr = -1;
    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {

        if(isEmpty()){
            throw new StackException("Item can not be pop because stack is empty");
        }
        int temp = data[ptr];
        ptr--;
        return temp;
    }

    public int peak() throws StackException {
        if(isEmpty()){
            throw new StackException("There is not a peak item because stack is empty");
        }

        return data[0];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == - 1;
    }
}
