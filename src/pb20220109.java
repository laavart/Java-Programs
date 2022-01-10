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
        int l = s.length(), h=0, e=0;
        for(int i=0; i<l; i++){
            char b=0, c=0, d=0;
            if(i!=0) b = s.charAt(i-1);
            c = s.charAt(i);
            if(i!=l-1) d = s.charAt(i+1);
            if(c == '(') h++;
            else if(c ==')') h--;
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        perfectNumber(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()));

        expVal(bRead.readLine());
    }
}
