import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class d1214{

    static Vector<String> vs = new Vector<>();
    static void sortedUniquePermutation(String s, String k){
        int l = s.length();
        int n = k.length();
        if(n==l && !(vs.contains(k) || k.equals(s))){
            vs.add(k);
            System.out.println(k);
            return;
        }
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(k.indexOf(c) == -1){
                String r = k+c;
                if(vs.contains(r)) i=0;
                else sortedUniquePermutation(s, r);
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        sortedUniquePermutation(bRead.readLine(), "");
    }
}
