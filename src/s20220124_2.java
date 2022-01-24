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
        /**
         * The elements are sorted in ascending order
         */
        System.out.println(t);
        /**
         * The elements are sorted in reverse order
         */
        System.out.println(t.descendingSet());
        /**
         * headSet(_) returns a set with elements smaller than the given element
         * headSet(_,_) here additional argument is to include that number or not
         */
        System.out.println(t.headSet(32,true));
        /**
         * tailSet(_) returns a set with elements larger than the given element
         * tailSet(_,_) here additional argument is to include that number or not
         */
        System.out.println(t.tailSet(17,true));
        /**
         * subSet(F,T) returns a set with elements "from F to T"
         * subSet(F,BF,T,BT) here additional arguments "BF,BT" are to include that number or not
         */
        System.out.println(t.subSet(17,true,32,true));
        /**
         * first() returns the first element of the set
         * last() returns the last element of the set
         */
        System.out.println(t.first()+"\t"+t.last());
        /**
         * lower(E) returns the max element smaller than E
         * higher() returns the min element larger than E
         */
        System.out.println(t.lower(30)+"\t"+t.higher(30));
        /**
         * ceiling(E) returns E if present in set or the max element smaller than E
         * floor(E) returns E if present in set or the min element larger than E
         */
        System.out.println(t.floor(30)+"\t"+t.ceiling(30));
        /**
         * comparator() returns comparator used to form set
         * returns null, if it uses natural ordering of element
         */
        System.out.println(t.comparator());
    }
}
