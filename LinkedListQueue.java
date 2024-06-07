import java.util.Queue;
import java.util.LinkedList;
public class LinkedListQueue {
    public static void main(String[] args) {
        
        Queue <Integer> queue = new LinkedList<>();

        // Inserting the elements in the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println("Queue: "+queue);

        // Deleting the element from the Queue
        System.out.println(queue.poll());

        System.out.println("After deleting....");
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
