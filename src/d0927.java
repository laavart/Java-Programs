import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class d0927 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static void Phi(int n){

        int c=0;

        for(int i = n-1; i>=1; i--){

            int gcd=1;

            for(int j=1; j<=i && j<=n; j++){

                if(i%j==0 && n%j==0){

                    gcd = j;
                }
            }

            if(gcd == 1){

                c++;
            }
        }

        if(n==1){

            System.out.println(1);
        }
        else{

            System.out.println(c);
        }
    }

    static void simpleSieve(int n, Vector<Integer> p){
        Boolean[] P = new Boolean[n+1];

        for(int i=0; i<=n; i++)
            P[i] = true;

        for(int i=2; (i*i)<=n; i++)
            for(int j=i*i; j<=n; j+=i)
                P[j] = false;

        for(int i=2; i<=n; i++){
            if(P[i]){
                p.add(i);
            }
        }
    }

    static void eulerPhiUsingSimpleSieve(int n){

        Vector<Integer> v = new Vector<>();

        simpleSieve(n, v);

        int r=n;

        for(int x: v){

            if(n % x == 0){

                r -= (n/x);  // r = r*( 1 - (1/x) ) => r = r - (r/x) => r -= (r/x)
            }
        }

        System.out.println(r);
    }

    static void eulerPhiGoingHalf(int n){

        float r=n;

        for(int i = 2; i <= n/2; i++){

            if(n%i == 0){

                r -= (r/i);  // r = r*( 1 - (1/i) ) => r = r - (r/i) => r -= (r/i)
            }
        }

        System.out.println( ( (int) r ) );
    }

    public static void main(String[] Args) throws Exception{

        eulerPhiUsingSimpleSieve(Integer.parseInt(bRead.readLine()));

        bRead.close();
    }
}
