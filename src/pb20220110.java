import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb20220110 {

    // TC = O(n), SC = O(n)
    static long fiboSeries(int n){
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            if(i<2) a[i] = i;
            else a[i] = a[i-1]+a[i-2];
        }
        return a[n-1];
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        while(true) System.out.println(fiboSeries(Integer.parseInt(bRead.readLine().trim())));
    }
}
