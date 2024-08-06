public class QueueMain {

    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue(5);

        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);

        queue.display();

        System.out.println(queue.remove());
        queue.display();

    }
}
