import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class s20220123_2 {
    public static void main(String... Args){
        ArrayDeque<Integer> a = new ArrayDeque<>(20);
        LinkedList<Integer> b = new LinkedList<>(List.of(2, 99, -6));

        a.addAll(b);

        a.add(3);
        a.addFirst(20);
        a.addLast(100);

        a.offer(6);
        a.offerFirst(3);
        a.offerLast(15);

        a.push(65);

        a.remove();
        a.removeFirst();
        a.removeLast();

        a.poll();
        a.pollFirst();
        a.pollLast();

        a.pop();

        a.retainAll(b);


        /**
         * You can use ArrayDeque instead of stack
         * As stack is a legacy class
         */
    }
}
