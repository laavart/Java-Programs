import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class d0924 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static void incrementalSieve(){
        Vector<Integer> p = new Vector<>();
        int r = 10;

        d0920.sieveOfEratosthenes(r, p);

        int c=1;
        int low = (c*r)+1, high = (c*r)+r;

        while(c<10){

            Boolean P[] = new Boolean[r+1];

            Arrays.fill(P, true);

            for (Integer i : p)
                for (int j = i * i; j < c*high; j += i)
                    if (j >= low && j <= high)
                        P[j-low+1] = false;

            for(int i=1; i<=r; i++)
                if(P[i]) {
                    p.add(i+low-1);
                    System.out.println(i+low-1);
                }

            c++;
            low = (c*r)+1;
            high = (c*r)+r;
        }
    }

    public static void main(String[] Args) throws Exception{

        incrementalSieve();

        bRead.close();
    }
}
