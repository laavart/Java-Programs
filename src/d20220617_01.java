import java.io.*;

public class d20220617_01 {
    public static void main(String[] Args) throws IOException {
        /**
         * Base 17 number conversion to decimal
         * 0 ... 9, A->10, B->11, C->12, D->13, E->14, F->15, G->16
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bufferedReader.readLine();
            int b = 1, r = 0;
            for (int i = (s.length() - 1); i >= 0; i--, b *= 17) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) r += ((c - 48) * b);
                else switch (c) {
                    case 'A' -> r += (10 * b);
                    case 'B' -> r += (11 * b);
                    case 'C' -> r += (12 * b);
                    case 'D' -> r += (13 * b);
                    case 'E' -> r += (14 * b);
                    case 'F' -> r += (15 * b);
                    case 'G' -> r += (16 * b);
                }
            }
            System.out.println(r);
        }
    }
}
