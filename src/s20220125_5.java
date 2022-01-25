import java.util.Arrays;
import java.util.Comparator;

class MyCom implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class s20220125_5 {
    public static void main(String... Args) {
        Integer[] a = {1,5,65,19,-13,-5};

        Arrays.sort(a);
        System.out.println("Using Natural:- ");
        for(var x: a) System.out.println(x);

        Arrays.sort(a, new MyCom());
        System.out.println("Using Created Comparator:- ");
        for(var x: a) System.out.println(x);

    }
}
