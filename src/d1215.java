import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1215 {

    static int maneuver(int m, int n){
        if(m==1 || n==1) return 1;
        return maneuver(m-1,n) + maneuver(m, n-1) ;
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Paths : "+maneuver(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine())));
    }
}
