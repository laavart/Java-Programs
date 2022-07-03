import java.io.*;

public class d20220616_01 {
    public static void main(String[] args) throws IOException {
        /**
         * Series
         * 1 1 2 3 4 9 8 27 16 81 32 243 64 29 128 2187 ...
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int m2 = 1, m3 = 1;
            for (int i = 2; i < n; i++) {
                if (i % 2 == 0) {
                    m2 *= 2;
                    if (i == n - 1) System.out.println(m2);
                } else {
                    m3 *= 3;
                    if (i == n - 1) System.out.println(m3);
                }
            }
        }
    }
}