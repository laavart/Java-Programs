import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1124 {

    static void manachersLongestPalindrome(String s){
        int l = s.length();

        for(int i=l; i>1; i--){
            for(int j=0; j+i<=l; j++){
                String ss = s.substring(j,j+i).toLowerCase();
                int ssl = ss.length();
                int f = 0, r = ssl-1, check = 0;
                while(f<=r){
                    if(ss.charAt(f++) == ss.charAt(r--))
                        check++;
                    else
                        break;
                }
                if(check == (ssl+1)/2){
                    System.out.println(ss);
                    return;
                }
            }
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        manachersLongestPalindrome(bRead.readLine());
    }
}
