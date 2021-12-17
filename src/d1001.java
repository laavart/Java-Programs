import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1001 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static boolean matchAllOtherIndexes(int[] a, int[] r, int n, int i){
        boolean b;
        if(i == a.length-1)
            b = ((n - r[i])%a[i] == 0);
        else{
            if( (n-r[i]) % a[i] == 0 )
                b = matchAllOtherIndexes(a,r,n,++i);
            else
                b = false;
        }
        return b;
    }

    static void chineseRemainderTheorem(int[] a, int[] r){
        int i=1;
        while(true){
            int n = a[0]*i + r[0];
            if( matchAllOtherIndexes(a,r,n,1) ){
                System.out.println(n);
                break;
            }
            i++;
        }
    }

    public static void main(String[] Args) throws Exception{
        int[] a = {5,7};
        int[] b = {1,3};
        chineseRemainderTheorem(a,b);
        int[] c = {3,4,5};
        int[] d = {2,3,1};
        chineseRemainderTheorem(c,d);

        bRead.close();
    }
}
