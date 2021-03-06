import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1018 {

    static int binaryStringToInteger(String b){
        int i = b.length()-1;
        int m = 1;
        int c = 0;
        while(i>=0){
            c += Integer.parseInt( String.valueOf( b.charAt(i--) ) )*m;
            m*=2;
        }
        return c;
    }

    static int swapNibblesInAByte(int a){
        StringBuilder s = new StringBuilder(Integer.toBinaryString(a));
        int len = s.length();
        for(int i=0; i<8-len; i++){
            s.insert(0, "0");
        }
        System.out.println(s);
        s = new StringBuilder(s.substring(4) + s.substring(0, 4));
        System.out.println(s);
        return binaryStringToInteger(s.toString());
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(swapNibblesInAByte(Integer.parseInt(bRead.readLine())));
    }
}