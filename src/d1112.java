import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Vector;

public class d1112 {
    static void weightedSubstring(String s, String w, int n){
        int l = s.length();
        int c = 0, i=1;
        HashSet<String> h =  new HashSet<>();

        for(int j=0; j+i<=l && i<=l; j++){
            int sm = 0;
            String ss = s.substring(j, j+i);

            boolean check = h.contains(ss);

            if(!check){
                for(int k=0; k<i; k++)
                    sm += (ss.charAt(k)>=97 && ss.charAt(k)<=122) ? w.charAt(ss.charAt(k)-97)-48 : w.charAt(ss.charAt(k)-65)-48;

                if(sm<=n){
                    c++;
                    h.add(ss);
                }
            }

            if(j+i == l){
                i++;
                j = -1;
            }
        }

        System.out.println(c);

        for(String x: h) System.out.println(x);
    }

    static void hyphenToFront(String s){
        int l = s.length();
        String n = "";

        for(int i=0; i<l; i++){
            char c =s.charAt(i);
            if(c=='-'){
                n = "-"+n;
            }
            else{
                n += c;
            }
        }

        System.out.println(n);
    }

    public static void main(String[] Args) throws Exception {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        weightedSubstring(bRead.readLine(), bRead.readLine(), Integer.parseInt(bRead.readLine()));

        //hyphenToFront(bRead.readLine());
    }
}
