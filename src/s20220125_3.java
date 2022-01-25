import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * StringTokenizer
 */
public class s20220125_3 {
    public static void main(String... Args) throws IOException {
        String s = "Name=Laavart;Age=20;City=RBL;State=UP";
        /**
         * StringTokenizer(_);
         * Takes a String as 1st argument
         *
         * StringTokenizer(_,_);
         * 2nd argument contains all "delimiter" (only a single character)
         *
         * StringTokenizer(_,_,_);
         * Returns delimiter also if "3rd" argument is true
         */
        StringTokenizer t = new StringTokenizer(s,"=;",true);

        /**
         * nextToken(D) returns next token after delimiter "D"
         * It could also be blank
         */
        while (t.hasMoreTokens()) System.out.println(t.nextToken("=;"));

        /**
         * We can take content of a file then tokenize it
         */
        FileInputStream fIS = new FileInputStream("OutFiles\\s20220125_3.txt");
        s = new String(fIS.readAllBytes());
        t = new StringTokenizer(s,"=\n");
        while (t.hasMoreTokens()) System.out.println(t.nextToken());

    }
}
