import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority_queue {
    public static void main(String[] args) {
        // Min-heap is also working so the smallest element will come at fast place
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Inserting the value in the Priority Queue
        pq.offer(28);
        pq.offer(1);
        pq.offer(22);
        pq.offer(48);
        pq.offer(55);
        pq.offer(88);

        // Now displaying the pq
        System.out.println("Priority Queue: "+pq);

        // Poll()
        pq.poll();
        System.out.println(pq);

        // Peek()
        System.out.println(pq.peek());
    }
}