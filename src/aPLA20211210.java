import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class aPLA20211210 {

    // Question 1 Code
    static void q1(int n, int r){
        int p=1, c;
        for(int i=n; i>n-r; i--)
            p*=i;
        c = p;
        for(int i=r; i>1; i--)
            c/=i;
        System.out.println(p);
        System.out.println(c);
    }

    // Question 2 Code
    static void q2(int[] a1, int[] a2, int k){
        Vector<Integer> v = new Vector<>();
        //For First Array
        {
            int l1 = a1.length;
            for(int i=0; i<=k; i++) v.add(a1[i]);
            for(int i=0; i<l1-k-1; i++) a1[i] = a1[i+k+1];
            for(int i=(l1-k-1); i<l1; i++) a1[i] = v.get(i-(l1-k-1));
            for(int x: a1) System.out.print(x + " ");
            System.out.println();
        }
        v.clear();
        //For Second Array
        {
            int l2 = a2.length;
            for(int i=l2-k; i<l2; i++) v.add(a2[i]);
            for(int i=l2-k-1; i>=0; i--) a2[i+k] = a2[i];
            for(int i=0; i<k; i++) a2[i] = v.get(i);
            for(int x: a2) System.out.print(x + " ");
            System.out.println();
        }
    }

    // Question 3 Code
    static void q3(String s, String k, int n){
        int l = s.length();
        if(n==l){
            System.out.println(k);
            return;
        }
        for(int i=0; i<l; i++){
            char c = s.charAt(i);
            if(k.indexOf(c) == -1){
                String r = k+c;
                q3(s, r, ++n);
                i=0;
            }
        }
    }

    // Question 4 Code
    static void q4(int[] a){
        Vector<Integer> v = new Vector<>();
        int max = Integer.MIN_VALUE;
        for(int i = (a.length)-1; i>=0; i--)
            if(a[i]>max){
                max = a[i];
                v.add(max);
            }
        for(int i = (v.size())-1; i>=0; i--)
            System.out.println(v.get(i));
    }

    // Question 5 Code
    static void q5(int[] a){
        int sum = 0,  l = a.length;
        for(int i : a) sum+=i;
        if(l>0){
            int max = 0, c = 0;
            for (int i=0; i<l; i++) {
                c += a[i];
                if (c == sum - c + a[i] && a[max] < c) max = i;
            }
            System.out.println(max);
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //q1(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()));

        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {1,2,3,4,5,6,7,8};
        //q2(a, b, Integer.parseInt(bRead.readLine()));

        q3("jump","",0);

        int[] c = {7,6,4,5,0,1};
        //q4(c);

        int[] d = {-2,5,3,1,2,6,-4,2};
        //q5(d);
    }
}
