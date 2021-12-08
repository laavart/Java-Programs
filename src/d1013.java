import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d1013 {

    static int karatsubaAlgoFor2Digits(int M, int N){
        int ml = (int) Math.ceil(Math.log(M));
        int nl = (int) Math.ceil(Math.log(N));

        int[] m = new int[ml];
        int[] n = new int[nl];

        for(int i=0; i<ml; i++){
            m[i] = M%10;
            n[i] = N%10;

            M/=10;
            N/=10;
        }


        int a = m[1]*n[1];
        int b;
        int c = m[0]*n[0];

        b = Arrays.stream(m).sum()*Arrays.stream(n).sum()-a-c;

        return a* 100 + b*10 + c;
    }

    static int longestSequenceAfter1Flip(int n){
        String b = "0"+Integer.toBinaryString(n);
        System.out.println("Binary Form: "+b);

        int l = 0;
        for(int i=1; i<b.length()-1; i++){
            if(b.charAt(i) == '0'){
                l++;
            }
        }

        if(l != 0){

            int[] a = new int[l+1];
            int c=0;
            int z=0;

            for(int i=1; i<b.length(); i++){
                if(b.charAt(i) == '0'){
                    a[c++] = z;
                    z = 0;
                }
                else if(i==b.length()-1){
                    z++;
                    a[c] = z;
                }
                else {
                    z++;
                }
            }

            int max = 0;
            for(int i=0; i<l; i++){
                int t = a[i]+a[i+1];
                if(max<t){
                    max = t;
                }
            }

            return max+1;
        }
        else{
            return b.length();
        }
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println( karatsubaAlgoFor2Digits( Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()) ) );

        System.out.println( longestSequenceAfter1Flip( Integer.parseInt(bRead.readLine()) ) );

        bRead.close();
    }
}
