import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aPLA20211018 {

    static boolean palindrome(String s){
        int len = s.length();
        int c = 0;
        for(int i=0; i<(len+1)/2; i++){
            if(s.charAt(i) == s.charAt(len-i-1))
                c++;
        }
        return c == ((len+1)/2);
    }

    // Question 1 Code
    static boolean q1(String s){
        int len = s.length();
        String r;
        for(int i=0; i<len; i++){
            r = s.substring(0,i)+s.substring(i+1, len);
            if(palindrome(r))
                return true;
        }
        return false;
    }

    // Question 2 Code
    static int q2(int a, int b){
        int r = 1;
        for(int i=2; a/i>0 || b/i>0; i++){
            while(a%i==0 && b%i==0){
                a/=i;
                b/=i;
                r*=i;
            }
            while(a%i==0){
                    a/=i;
                    r*=i;
            }
            while(b%i==0){
                b/=i;
                r*=i;
            }
        }
        return r;
    }

    // Question 3 Code
    static boolean q3(int y){
        if(y%400==0){
            return true;
        }
        else if(y%100==0){
            return false;
        }
        else{
            return y%4==0;
        }
    }

    static boolean coPrime(int a, int b){
        int r = 1;
        for(int i=2; a/i>0 && b/i>0; i++){
            if(a%i==0 && b%i==0){
                a/=i;
                b/=i;
                r*=i;
            }
        }
        return r==1;
    }

    // Question 4 Code
    static void q4(int a, int b){
        for(int i=2; i<a; i++){
            if(coPrime(i,a) && i%b==0){
                System.out.println(i);
            }
        }
    }

    // Question 5 Code
    static void q5(int a, int b){
        while(a<=b){
            String s = ""+a++;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='2' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='9'){
                    break;
                }
                if(i==s.length()-1){
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        // Question 1
        System.out.println(q1(bRead.readLine()));

        // Question 2
        System.out.println(q2(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine())));

        // Question 3
        System.out.println(q3(Integer.parseInt(bRead.readLine())));

        // Question 4
        q4(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()));

        // Question 5
        q5(Integer.parseInt(bRead.readLine()), Integer.parseInt(bRead.readLine()));
    }
}
