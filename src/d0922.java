import java.io.*;
import java.util.Vector;
import java.util.Arrays;

public class d0922 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static void segmentedSieve(int n){
        Vector<Integer> p = new Vector<>();
        int r = (int) Math.sqrt(n)+1;

        d0920.sieveOfEratosthenes(r, p);

        int c=1;
        int low = (c*r)+1, high = (c*r)+r;

        while(low<=n){

            if(high>n) {
                high = n;
                r = high - c*r;
            }

            Boolean[] P = new Boolean[r + 1];

            Arrays.fill(P, true);

            for (Integer i : p)
                for (int j = i * i; j <= high; j += i)
                    if (j >= low)
                        P[j-low+1] = false;

            for(int i=1; i<=r; i++)
                if(P[i]){
                    p.add(i+low-1);
                    System.out.println(i+low-1);
                }


            c++;
            low = (c*r)+1;
            high = (c*r)+r;
        }
    }


    public static void main(String[] Args) throws Exception{

        segmentedSieve(Integer.parseInt(bRead.readLine()));

        bRead.close();
    }
}
