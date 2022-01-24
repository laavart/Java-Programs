import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap preserves the order in which the entries are entered
 */
public class s20220124_6 {
    public static void main(String... Args){
        int initCap = 3;
        /**
         * 3rd Argument is used to set order according to use of the element
         * Similar to LRU, i.e.,
         * First element would be least used
         */
        LinkedHashMap<Integer, String> l =new LinkedHashMap<>(initCap,0.75f,true){
            /**
             * This method limits the number of entry
             * if we enter element even when the limit exceed
             * then 1st entry would be deleted
             */
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return this.size() > initCap;
            }
        };
        l.put(1,"One");
        l.put(2,"Two");
        System.out.println(l);
        /**
         * Replaces the "value" at KEY if key is already present
         */
        l.put(1,"Ek");
        System.out.println(l);
        /**
         * Eldest element is deleted
         * i.e., first element, the least used element
         */
        l.put(3,"Three");
        l.put(4,"Four");
        System.out.println(l);
        /**
         * LinkedHashMap can also be used as Cache
         */
    }
}
