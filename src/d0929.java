import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d0929 {
    static BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

    static int eulerPhiUsingSquare(int n){
        int c=n;
        for(int i=2; i*i <= n; i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                c-=(c/i);
            }
        }
        if (n > 1){
            c-=(c/n);
        }
        return c;
    }

    static boolean isStrobogrammaticNumber(int n){
        String s = ""+n;
        n = s.length();
        int c = 0;
        for(int i = 0; i < (n+1)/2; i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '6' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                if(s.charAt(i) == s.charAt(n-i-1)  && s.charAt(i) != '6' && s.charAt(i) != '9'){
                    c++;
                }
                else if(s.charAt(i) == '6' && s.charAt(n-i-1) == '9'){
                    c++;
                }
                else if(s.charAt(i) == '9' && s.charAt(n-i-1) == '6'){
                    c++;
                }
                else break;
            }
        }
        return c == (n+1)/2;
    }

    static void strobogrammaticSeriesUpto(int n){
        for(int i = 0; i<=n; i++){
            String s = ""+i;
            int l = s.length();
            int c = 0;
            for(int j = 0; j < (l+1)/2; j++){
                if(s.charAt(j) == '0' || s.charAt(j) == '1' || s.charAt(j) == '6' || s.charAt(j) == '8' || s.charAt(j) == '9'){
                    if(s.charAt(j) == s.charAt(l-j-1) && s.charAt(j) != '6' && s.charAt(j) != '9') {
                        c++;
                    }
                    else if(s.charAt(j) == '6' && s.charAt(l-j-1) == '9'){
                        c++;
                    }
                    else if(s.charAt(j) == '9' && s.charAt(l-j-1) == '6'){
                        c++;
                    }
                    else break;
                }
            }
            if(c == (l+1)/2){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] Args) throws Exception{

        System.out.println( isStrobogrammaticNumber( Integer.parseInt( bRead.readLine() ) ) );
        strobogrammaticSeriesUpto( Integer.parseInt( bRead.readLine() ) );

        bRead.close();
    }
}