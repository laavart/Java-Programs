import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1011 {

    static void euclidAlgo(int a, int b){
        while(b!=0){
            if(a>b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println(a);
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        euclidAlgo( Integer.parseInt(bRead.readLine()) , Integer.parseInt(bRead.readLine()) );

        bRead.close();
    }
}
