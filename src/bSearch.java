import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bSearch {
    static boolean bSearch(int a[], int k){
        int mn = 0, mx = a.length-1;
        while(mn<=mx){
            int c = mn + (mx - mn) / 2;
            System.out.println(c);
            if(a[c]==k)
                return true;
            else if(a[c]>k)
                mx = c-1;
            else if(a[c]<k)
                mn = c+1;
        }
        return false;
    }

    public static void main(String Args[]) throws Exception{
        while(true){
            int A[] = {10,20,30,40,50,60};
            System.out.println(""+bSearch(A,Integer.parseInt( new BufferedReader(new InputStreamReader(System.in)).readLine() )));
        }
    }
}
