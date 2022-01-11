import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class pb20220109 {

    // TC = O(n^3/2), SC = O(1)
    static void perfectNumber(int l, int u){
        while(l<=u){
            if(l!=1){
                int s = 1;
                for (int i = 2; i * i <= l; i++) if(l%i==0) s+=(i+l/i);
                if(s==l) System.out.println(l);
            }
            l++;
        }
    }

    static Vector<String> v = new Vector<>();

    static Stack<Character> validExp(String e){
        Stack<Character> s = new Stack<>();
        int l = e.length();
        for(int i=0; i<l; i++){
            char c = e.charAt(i);
            if(c=='(') s.push(c);
            else if(c==')')
                if(s.isEmpty() || c == s.peek()) s.push(c);
                else s.pop();
        }
        return s;
    }

    static String removeParan(String e, Stack<Character> o, int n){
        StringBuilder sb = new StringBuilder(e);
        Stack<Character> s = (Stack<Character>) o.clone();
        while(n>=0 && !s.isEmpty()){
            char c = sb.charAt(n);
            if(c == s.peek()){
                sb.deleteCharAt(n);
                s.pop(); System.out.println(s);
            }
            n--;
        }
        e = sb.toString();
        System.out.println(e);
        if(v.isEmpty() || !v.contains(e)){
            v.add(e);
            return e;
        }
        else return "";
    }

    static void expVal(String e1){
        Stack<Character> s = validExp(e1);
        int l = e1.length();
        if(!s.isEmpty())
            System.out.println("Answer:");
            for(int i=l-1; i>=0; i--){
                String e2 = removeParan(e1, s, i);
                if(!e2.equals("") && validExp(e2).isEmpty()) System.out.println(" "+e2);
            }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //perfectNumber(Integer.parseInt(bRead.readLine().trim()), Integer.parseInt(bRead.readLine().trim()));

        while(true) expVal(bRead.readLine());
    }
}
