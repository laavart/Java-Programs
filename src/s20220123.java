import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList internally uses links to store elements
 * It takes extra space for links at each and every element/node
 */

public class s20220123 {
    public static void main(String... Args){
        LinkedList<Integer> a = new LinkedList<>();
        ArrayList<Integer> b = new ArrayList<>(List.of(50, 60, 70));

        /**
         * All functions are same as ArrayList
         * The difference is just it is "faster" than ArrayList when adding an element in between
         */
        a.add(5);
        a.add(10);
        a.addAll(1,b);
        System.out.println(a.size());
        System.out.println(a.get(3));
        System.out.println(a.getLast());
        System.out.println(a.indexOf(10));
        System.out.println(a);
    }
}
