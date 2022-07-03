import java.io.*;

public class d20220616_02 {
    public static void main(String[] args) throws IOException {
        /**
         * Series
         * 0 0 2 1 4 2 6 3 8 4 10 5 12 6 14 7 16 8 ...
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n % 2 == 1) System.out.println(n - 1);
            else System.out.println((n - 1) / 2);
        }
    }
}