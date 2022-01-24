import java.util.List;
import java.util.TreeSet;

/**
 * TreeSet guarantees to do basic functions
 * Like, add, remove, etc.
 * In Log(n) time
 * It means it could internally be using "AVL or Red-Black Tree"
 */
public class s20220124_2 {
    public static void main(String... Args){

        /**
         * TreeSet(), TreeSet(Collection), TreeSet(Comparator), TreeSet(SortedSet),
         */
        TreeSet<Integer> t = new TreeSet<>(List.of(10,20,30,50,45,32,2,17));

        System.out.println(t);
    }
}
