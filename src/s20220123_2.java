import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayDeque is double ended queue
 * You can use ArrayDeque instead of stack
 * As stack is a legacy class
 * It is better to use ArrayDeque
 */

public class s20220123_2 {
    public static void main(String... Args){
        ArrayDeque<Integer> a = new ArrayDeque<>(20);
        LinkedList<Integer> b = new LinkedList<>(List.of(2, 99, -6));

        /**
         * It has methods from Collection class
         * such as, add(), addAll(), remove(), removeAll(), retainAll(), replaceAll(), etc.
         */
        a.addAll(b);

        /**
         * Adding from both ends is possible
         * These functions throw Exceptions
         */
        a.add(3);
        a.addFirst(20);
        a.addLast(100);
        /**
         * These functions do NOT throw Exceptions
         */
        a.offer(6);
        a.offerFirst(3);
        a.offerLast(15);
        /**
         * To use as a stack
         */
        a.push(65);

        System.out.println(a);

        /**
         * Deleting from both ends is possible
         * These functions throw Exceptions
         */
        a.remove();
        a.removeFirst();
        a.removeLast();
        /**
         * These functions do NOT throw Exceptions
         */
        a.poll();
        a.pollFirst();
        a.pollLast();
        /**
         * To use as a stack
         */
        a.pop();

        System.out.println(a);
    }
}
