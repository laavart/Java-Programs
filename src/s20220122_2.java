import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class s20220122_2 {
    public static void main(String... Args){
        ArrayList<Integer> a = new ArrayList<>(20);
        ArrayList<Integer> b = new ArrayList<>(List.of(50, 60, 70));

        a.add(10);
        a.add(0,5);
        a.addAll(b);
        a.addAll(1,b);

        System.out.println(a.contains(50));
        System.out.println(a.equals(b));
        System.out.println(a.get(6));
        System.out.println(a.indexOf(70));
        System.out.println(a.lastIndexOf(70));
        System.out.println(a);

        a.replaceAll(n -> n+10);

        System.out.println(a);
        a.set(0,7);
        System.out.println(a);

        for(int i=0; i<a.size(); i++) System.out.print(a.get(i)+" ");
        System.out.println();

        for(var x: a) System.out.print(x+" ");
        System.out.println();

        for(Iterator<Integer> i = a.iterator(); i.hasNext();) {
            int x = i.next();
            System.out.print(x+" ");
        }
        System.out.println();

        for(ListIterator<Integer> i = a.listIterator(); i.hasNext();) {
            int x = i.next();
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
