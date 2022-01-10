import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb20220109 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

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

    public static void main(String[] Args) throws Exception{
        perfectNumber(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()));
    }
}
