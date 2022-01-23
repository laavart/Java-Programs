import java.util.ArrayDeque;

public class s20220123_2 {
    public static void main(String... Args){
        ArrayDeque<Integer> a = new ArrayDeque<>(20);
        a.addFirst(20);
        a.removeFirst();
        a.addLast(100);
        a.removeLast();
    }
}
