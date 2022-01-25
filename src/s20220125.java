import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Hashtable is a legacy class
 * We should use HashMap instead
 */
public class s20220125 {
    public static void main(String... Args){
        Hashtable h = new Hashtable();
        h.put(1,"a");
        h.put(2,"b");
        h.put(3,"c");
        h.put(4,"d");
        h.put(5,"e");

        /**
         * It is storing Objects in both places,
         * So we have to typecast it
         */
        String s = (String) h.get(3);
        System.out.println(s);

        /**
         * It does not have iterator
         * So we use Enumeration
         */
        Enumeration e;
        /**
         * returns all keys
         */
        e = h.keys();
        while(e.hasMoreElements()) System.out.print(e.nextElement()+" ");
        System.out.println();
        /**
         * returns all values
         */
        e = h.elements();
        while(e.hasMoreElements()) System.out.print(e.nextElement()+" ");
        System.out.println();
    }
}
