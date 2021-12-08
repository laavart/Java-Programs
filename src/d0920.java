import java.io.*;
import java.util.Vector;

public class d0920 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static void sieveOfEratosthenes(int n, Vector<Integer> p){
        Boolean[] P = new Boolean[n+1];

        for(int i=0; i<=n; i++)
            P[i] = true;

        for(int i=2; (i*i)<=n; i++)
            for(int j=i*i; j<=n; j+=i)
                P[j] = false;

        for(int i=2; i<=n; i++){
            if(P[i]){
                p.add(i);
                System.out.println(i);
            }
        }
    }

    public static void main(String[] Args) throws Exception{

        Vector<Integer> Prime = new Vector<>();
        sieveOfEratosthenes(Integer.parseInt(bRead.readLine()), Prime);

        bRead.close();
    }
}
