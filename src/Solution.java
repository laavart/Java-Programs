import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Solution {

    public String longestPalindrome(String s) {
        String r = "";

        HashMap<String,Boolean> h = new HashMap<>();
        int l = s.length();

        for(int i=0; i<l; i++){
            int j = 0, k = l-1, f=0;
            while(j<=k){
                String c = s.substring(j, k+1);
                if (!h.containsKey(c)) {
                    boolean b = palindrome(c);
                    h.put(c, b);
                    if(b && r.length()<c.length()) r = c;
                }
                if(f%2 == 0) j++;
                else k--;
                f++;
            }
        }

        return r;
    }

    Boolean palindrome(String s){
        int i=0, j=s.length()-1;
        while(i<=j) if(s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    public static void main(String... Args) throws IOException {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        Solution s = new Solution();

        System.out.println(s.longestPalindrome(bRead.readLine()));
    }
}