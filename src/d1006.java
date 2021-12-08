import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1006 {

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

    static String addBinaryStrings(String b1, String b2){
        String b="";
        String c = "0";

        int k;
        for(k=0; k < Math.min(b1.length(), b2.length()) ; k++){
            int i = b1.length()-1-k;
            int j = b2.length()-1-k;
            if(c.equals("0")){
                if(b1.charAt(i) == '0' && b2.charAt(j) == '0'){
                    b = "0"+b;
                    c = "0";
                }
                else if(b1.charAt(i) == '1' && b2.charAt(j) == '1'){
                    b = "0"+b;
                    c = "1";
                }
                else{
                    b = "1"+b;
                    c = "0";
                }
            }
            else{
                if(b1.charAt(i) == '0' && b2.charAt(j) == '0'){
                    b = "1"+b;
                    c = "0";
                }
                else if(b1.charAt(i) == '1' && b2.charAt(j) == '1'){
                    b = "1"+b;
                    c = "1";
                }
                else{
                    b = "0"+b;
                    c = "1";
                }
            }
        }

        while( k < Math.max(b1.length(), b2.length()) ){
            if(b1.length()>b2.length()){
                int i = b1.length()-1-k;
                if(c.equals("0")){
                    b = b1.charAt(i)+b;
                }
                else{
                    if(b1.charAt(i) == '0'){
                        b = "1"+b;
                        c = "0";
                    }
                    else{
                        b = "0"+b;
                        c = "1";
                    }
                }
            }
            else{
                int j = b2.length()-1-k;
                if(c.equals("0")){
                    b = b2.charAt(j)+b;
                }
                else{
                    if(b2.charAt(j) == '0'){
                        b = "1"+b;
                        c = "0";
                    }
                    else{
                        b = "0"+b;
                        c = "1";
                    }
                }
            }
            k++;
        }

        return b;
    }

    static String find2sCompliment(String b){
        String r="";

        for(int i=0; i<b.length(); i++){
            if(b.charAt(i) == '1'){
                r+="0";
            }
            else{
                r+="1";
            }
        }

        r = addBinaryStrings(r,"1");

        return r;
    }

    static int boothsAlgo(int B, int Q){
        String a="0", h="0";

        int c;
        if(B<0 && Q<0){
            B = Math.abs(B);
            Q = Math.abs(Q);
            c=2;
        }
        else if(B<0 || Q<0){
            B = Math.abs(B);
            Q = Math.abs(Q);
            c=1;
        }
        else{
            c=0;
        }

        if(B<Q){
            B = B^Q;
            Q = B^Q;
            B = B^Q;
        }

        String b = "0"+Integer.toBinaryString(B);
        String q = Integer.toBinaryString(Q);

        int  sa = a.length(), sq = q.length();

        for(int j=0; j <= (b.length()-sq-1); j++){
            q = "0"+q;
        }

        for(int j=0; j <= (b.length()-sa-1); j++){
            a = "0"+a;
        }

        int i = b.length();

        while(i >= 1){

            String t = q+h;
            t = t.substring(t.length()-2);

            if(t.equals("10")){
                t = find2sCompliment(b);
                a = addBinaryStrings(a,t);
            }
            else if(t.equals("01")){
                a = addBinaryStrings(a,b);
            }

            h = ""+q.charAt(q.length()-1);
            q = a.charAt(a.length()-1)+""+q.substring(0, q.length()-1);
            a = h+a.substring(0, a.length()-1);

            i--;
        }


        if(c%2 == 1){
            return -1*binaryStringToInteger(a+q);
        }
        else{
            return binaryStringToInteger(a+q);
        }
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();

        System.out.println("Multiplicand:");
        int b = Integer.parseInt(bRead.readLine());

        System.out.println("Multiplier:");
        int q = Integer.parseInt(bRead.readLine());

        System.out.println("Solution:");
        System.out.println( boothsAlgo(b,q) );

        System.out.println();

        bRead.close();
    }
}