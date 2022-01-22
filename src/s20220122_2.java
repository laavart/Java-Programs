import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList internally uses array to store elements
 */

public class s20220122_2 {
    public static void main(String... Args){
        ArrayList<Integer> a = new ArrayList<>(20);
        ArrayList<Integer> b = new ArrayList<>(List.of(50, 60, 70));

        /**
         * add() is used to add elements to the list
         */
        a.add(10);
        a.add(0,5);
        /**
         * addAll() is used to add elements from any another collection to current list
         */
        a.addAll(b);
        a.addAll(1,b);

        /**
         * These are for searching elements
         */
        System.out.println(a.contains(50));
        System.out.println(a.get(6));
        System.out.println(a.indexOf(70));
        System.out.println(a.lastIndexOf(70));

        /**
         * Check if the list objects have same values or not
         */
        System.out.println(a.equals(b));
        System.out.println(a);

        /**
         * Replace/Updates all values according to the "Lambda Expression"
         */
        a.replaceAll(n -> n+10);
        System.out.println(a);

        /**
         * Sets/replace value at an index with another value
         */
        a.set(0,7);
        System.out.println(a);

        /**
         * Printed using index
         */
        for(int i=0; i<a.size(); i++) System.out.print(a.get(i)+" ");
        System.out.println();

        /**
         * "var" automatically detects the datatype
         *
         * Printed using "Enhanced For"
         */
        for(var x: a) System.out.print(x+" ");
        System.out.println();

        /**
         * Iterated over all the elements using Iterators
         * They can only iterate/move in one direction, i.e., "next"
         */
        for(Iterator<Integer> i = a.iterator(); i.hasNext();) {
            int x = i.next();
            System.out.print(x+" ");
        }
        System.out.println();

        /**
         * Iterated over all the elements using ListIterators
         * They can only iterate/move in both direction, "next" and "previous"
         * ListIterators can start iterating from any index
         * We just have to give an index number as an argument in listIterator()
         *
         * listIterator(_), "_" => index
         */
        for(ListIterator<Integer> i = a.listIterator(); i.hasNext();) {
            int x = i.next();
            System.out.print(x+" ");
        }
        System.out.println();

        /**
         * forEach() performs an action (Lambda Expression) on all elements
         */
        a.forEach(x -> System.out.print(x+" "));
        System.out.println();
    }
}
