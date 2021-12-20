import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1220 {
    static void removeVowels(String s, StringBuilder r, int n){
        if(n < s.length()){
            char c = s.charAt(n);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
                r.append(c);
            removeVowels(s, r, ++n);
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder r = new StringBuilder();
        removeVowels(bRead.readLine(), r, 0);
        System.out.println(r);
    }
}
