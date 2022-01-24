import java.util.TreeMap;

/**
 * TreeMap internally implements red black tree hence guarantees "log(n)" Time Complexity, and It is Sorted
 * And implements NavigableMap Interface to get navigation methods returning the closest matches for given search target
 */
public class s20220124_4 {
    public static void main(String... Args){
        /**
         * TreeMap()
         * Constructs a new, empty tree map, using the natural ordering of its keys.
         *
         * TreeMap(Comparator<"? super K"> comparator)
         * Constructs a new, empty tree map, ordered according to the given comparator.
         *
         * TreeMap(Map<"? extends K","? extends V"> m)
         * Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.
         *
         * TreeMap(SortedMap<"K","? extends V"> m)
         * Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.
         */
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1,"One");
        tm.put(2,"Two");
        /**
         * putIfAbsent(K,V) only work if the same key "K" is not present already
         * put(K,V) on the other hand updates the value to "V", if "K" is already present
         */
        tm.putIfAbsent(1,"Ek");
        tm.putIfAbsent(3,"Three");

        /**
         * returns a MAP
         */
        System.out.println(tm);
        /**
         * entrySet() returns a set with key-value pair
         */
        System.out.println(tm.entrySet());

        /**
         * returns a set of keys only
         */
        System.out.println(tm.keySet());

        /**
         * returns a set of values only
         */
        System.out.println(tm.values());

        /**
         * returns a NAVIGABLE set of keys only
         */
        System.out.println(tm.navigableKeySet());
    }
}
