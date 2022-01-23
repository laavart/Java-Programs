import java.util.PriorityQueue;

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

        System.out.println(p);
    }
}
