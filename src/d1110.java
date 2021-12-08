import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d1110 {

    static void lexiPalindrome(String s){
        int[] a = new int[26];
        Arrays.fill(a,0);

        for(int i=0; i<s.length(); i++){
            int d = s.charAt(i);
            d = (d<=122 && d>=97) ? d-97 : d-65;
            a[d]++;
        }

        int c = 0;
        String f = "", e = "";

        for(int i=0; i<26; i++){
            while(a[i]>0){
                if(a[i]-2>=0){
                    a[i]-=2;
                    f = f + (char) (i+97);
                }
                else if(e.equals("")){
                    e = "" + (char) (i+97);
                    a[i]--;
                }
                else {
                    c++;
                    break;
                }
            }
        }

        if(c!=0){
            System.out.println("Lexo Palindrome Not Applicable!!!");
        }
        else{
            String r = "";
            for(int i = f.length()-1; i>=0; i--){
                r += f.charAt(i);
            }
            System.out.println(f+e+r);
        }
    }

    static void naturalSortOrder(String[] s){
        int[] n = new int[s.length];
        Arrays.fill(n,0);

        for(int i=0; i<s.length; i++){
            int j;
            for(j=0; j<s[i].length(); j++)
                if(s[i].charAt(j+1) >= '0' && s[i].charAt(j+1) <= '9')
                    break;
            if(j+1 < s[i].length()){
                n[i] = Integer.parseInt(s[i].substring(j+1));
            }
            s[i] = s[i].substring(0,j+1);
        }

        for(int i=0; i<s.length; i++){
            int m=i;

            for(int j=i; j<s.length; j++){
                if (s[m].compareTo(s[j]) > 0)
                    m = j;
                else if (s[m].compareTo(s[j]) == 0 && n[m] > n[j])
                    m = j;
            }

            if(i!=m){
                //StringSwap
                String t = s[i];
                s[i] = s[m];
                s[m] = t;
                //NumberSwap
                n[i] = n[i]^n[m];
                n[m] = n[i]^n[m];
                n[i] = n[i]^n[m];
            }
        }

        for(int i=0; i<s.length; i++)
            System.out.println(s[i]+n[i]);
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //lexiPalindrome(bRead.readLine());

        String[] s = {"z11","a31","a2","l6","n9","y10","l11"};
        //naturalSortOrder(s);

        int a[] = {10,6,5,1,9};//{10,3,4,5,23,6,9,13,62,32};
        /*
        Sort.qSort(a,0, a.length);
        for(int x: a)
            System.out.println(x);
        */
    }
}
