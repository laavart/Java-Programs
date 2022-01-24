import java.util.HashSet;

/**
 * HashSet is used to find data in a constant or least possible time
 */
public class s20220124 {
    public static void main(String... Args){
        /**
         * Constructors are,
         * HashSet() => initial capacity is by default "16" and loading factor "0.75f"
         * HashSet(_) => initial capacity is set to "_" and loading factor will be "0.75f"
         * HashSet(_,_f) => initial capacity is set to "_" and loading factor is set to "_f"
         * HashSet(_) => to create a Hashset from any collection with default properties as, loading factor - "0.75"
         */
        HashSet<Integer> h = new HashSet<>(20,0.5f);
        h.add(10);
        h.add(20);
        h.add(30);
        /**
         * Element repetition are not allowed
         */
        h.add(10);
        /**
         * The order of elements may not be preserved
         */
        System.out.println(h);
        System.out.println(h.remove(12));
        System.out.println(h.remove(20));
        System.out.println(h);
    }
}
