import java.util.BitSet;

/**
 * BitSet is a BOOLEAN "Array"
 * It implements from Vector
 */
public class s20220125_4 {
    public static void main(String... Args) {
        BitSet b1 = new BitSet();
        /**
         * set(I) => sets bits to true on index "I"
         */
        b1.set(1);
        b1.set(3);
        b1.set(5);
        b1.set(7);
        b1.set(11);
        b1.set(13);
        b1.set(17);
        b1.set(19);
        System.out.println(b1);
        /**
         * set(I,J) => sets bits to true from index "I" to "J"
         */
        b1.set(21,30);
        System.out.println(b1);
        /**
         * set(I,B) => sets bits to "B" on index "I"
         */
        b1.set(7,false);
        System.out.println(b1);
        /**
         * set(I,J,B) => sets bits to "B" from index "I" to "J"
         */
        b1.set(7,22,false);
        System.out.println(b1);
        /**
         * flip(I) => Flips converts a bit at "I" from true to false or vice-versa
         */
        b1.flip(8);
        System.out.println(b1);
        /**
         * flip(I,J) => Flips converts a bit from "I"to "J", from true to false or vice-versa
         */
        b1.flip(1,13);
        System.out.println(b1);
        /**
         * It performs all bitwise operations like,
         * BitSet "B"
         * and(B) => Intersection
         * andNot(B)
         * or(B) => Union
         * xor(B)
         * intersects(B)
         */
    }
}
