import java.util.HashMap;

/**
 * HashSet is used to find data in a constant or least possible time
 * Uses "Open Addressing"
 */
public class s20220124_5 {
    public static void main(String... Args) {
        /**
         * HashMap() => initial capacity is by default "16" and loading factor "0.75f"
         * HashMap(_) => initial capacity is set to "_" and loading factor will be "0.75f"
         * HashMap(_,_f) => initial capacity is set to "_" and loading factor is set to "_f"
         * HashMap(_) => to create a Hashset from any map with default properties as, loading factor - "0.75"
         */
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"One");
        hm.put(2,"Two");
        System.out.println(hm);

        /**
         * Here the value of key "1" just got updated
         */
        hm.put(1,"Ek");
        System.out.println(hm);

        /**
         * it computes lambda expression for any particular entry
         */
        hm.compute(2, (k,v) -> v + "Do");
        System.out.println(hm);
    }
}
