import java.io.*;

public class d20220617_02 {
    public static void main(String[] Args) throws IOException {
        /**
         * Start from right and rotate left with each turn
         * increase 10 wih each rotation
         * but rotate right at every 5th turn
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int x = 0, y = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 1) x += (10 * i);
                else if (i % 5 == 2) y += (10 * i);
                else if (i % 5 == 3) x -= (10 * i);
                else if (i % 5 == 4) y -= (10 * i);
                else x += (10 * i);
            }
            System.out.println(x + " " + y);
        }
    }
}