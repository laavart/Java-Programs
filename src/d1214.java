import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class d1214{

    static Vector<String> vs = new Vector<>();
    static void sortedUniquePermutation(String s, String k){
        int l = s.length();
        int n = k.length();
        Integer[] hs = new Integer[26];
        Arrays.fill(hs, 0);
        for(int j=0; j<l; j++) {
            int i = s.charAt(j);
            i = i>=97 ? i-97 : i-65;
            hs[i]++;
        }
        if(n==l && !vs.contains(k)){
            boolean check = false;
            for(int j=0; j<l; j++){
                int i = k.charAt(j);
                i = i>=97 ? i-97 : i-65;
                hs[i]--;
                if(hs[i] >= 0) check = true;
                else return;
            }
            if(check){
                vs.add(k);
                System.out.println(k);
                return;
            }
        }
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            int j = (c >= 97) ? c - 97 : c - 65;
            if(hs[j] > 0){
                hs[j]--;
                if(vs.contains(k+c)) i=0;
                else sortedUniquePermutation(s, (k+c));
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        sortedUniquePermutation(bRead.readLine(), "");
    }
}
