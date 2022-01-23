import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * A Comparator is used to set criteria for priority
 * "1" or "+ve Number" is LOW Priority
 * "-1" or "-ve Number" is HIGH Priority
 */
class MyComp implements Comparator<Integer> {
    /**
     * Can also be
     * @return o2 - o1
     * To use PriorityQueue in descending order
     */
    public int compare(Integer o1, Integer o2) {
        if(o1>o2) return -1;
        else if(o1<o2) return 1;
        else return 0;
    }
}

/**
 * Priority Queue internally implements heap
 */
public class s20220123_3 {
    public static void main(String... Args){
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(11);
        p.add(9);
        p.add(33);
        p.add(65);
        p.add(-8);
        p.offer(10);
        System.out.println(p);

        /**
         * remove() deletes the "highest" PRIORITY element by default
         * i.e., the "smallest" NUMBER
         * But we can change it
         */
        p.remove();
        System.out.println(p);
        p.remove();
        System.out.println(p);
        p.poll();
        System.out.println(p);

        /**
         * returns the highest priority number
         */
        System.out.println(p.peek());

        /**
         * Using comparator MyComp
         */
        PriorityQueue<Integer> q = new PriorityQueue<>(new MyComp());
        q.add(11);
        q.add(9);
        q.add(33);
        q.add(65);
        q.add(-8);
        q.offer(10);
        System.out.println(q);
    }
}
