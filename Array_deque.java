import java.util.ArrayDeque;
public class Array_deque {
    public static void main(String[] args) {
        
        /* Declairing the array deque */
        ArrayDeque <Integer> dq = new ArrayDeque<>();

        dq.offer(22);
        dq.offerFirst(12);
        dq.offerLast(45);


        System.out.println("Array deque: "+dq);

        dq.offer(32);

        System.out.println(dq);

        System.out.println();
        System.out.println(dq.peek());

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println();

        // Poll function
        dq.poll();
        System.out.println(dq);

        /* Pollfirst function */
        dq.pollFirst();
        System.out.println("Poll First: "+dq);

        /* PollLast function */
        dq.pollLast();
        System.out.println("Poll Last: "+dq);
    }
}
