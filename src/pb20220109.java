import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb20220109 {

    static void perfectNumber(int l, int u){
        while(l<=u){
            if(l!=1){
                int s = 1;
                for (int i = 2; i * i <= l; i++) if(l%i==0) s+=(i+l/i);
                if(s==l) System.out.println(l);
            }
            l++;
        }
    }

    static void expVal(String s){
        int l = s.length(), h=0;
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(c == '(') h++;
            else if(c ==')') h--;
            if(h<0) cPar(s.substring(i)+s.substring(i+1,l));
        }
        if(h>0) oPar(s);
    }

    static void cPar(String s){

    }

    static void oPar(String s){

    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //perfectNumber(Integer.parseInt(bRead.readLine().trim()), Integer.parseInt(bRead.readLine().trim()));

        expVal(bRead.readLine());
    }
}
