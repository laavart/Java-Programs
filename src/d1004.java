import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1004 {
    static void palindrome(String s){
        int l = s.length();
        int c = 0;

        for(int i=0; i<(l+1)/2; i++){
            if(s.charAt(i) == s.charAt(l-i-1)){
                c++;
            }
        }

        if (c == (l+1)/2){
            System.out.println("Yes! It's a Palindrome");
        }
        else{
            System.out.println("No! Not a Palindrome");
        }
    }

    static void binaryPalindrome(int n){
        String b = "";

        while(n>0){
            if(n%2==0){
                b+="0";
            }
            else{
                b+="1";
            }
            n/=2;
        }

        palindrome(b);
    }

    static void nBinaryPalindrome(int n){
        int p=0;
        for(int i=1; true; i++){
            String b = Integer.toBinaryString(i);

            int l = b.length();
            int c = 0;

            for(int j=0; j<(l+1)/2; j++){
                if(b.charAt(j) == b.charAt(l-j-1)){
                    c++;
                }
            }

            if (c == (l+1)/2){
                p++;
            }

            if(p == n){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        binaryPalindrome(Integer.parseInt(bRead.readLine()));

        nBinaryPalindrome(Integer.parseInt(bRead.readLine()));

        bRead.close();
    }
}
