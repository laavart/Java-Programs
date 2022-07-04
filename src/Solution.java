import java.util.*;

class Solution {
    static String function(String ...s) {
        StringBuilder r = new StringBuilder();
        byte t = 0;
        for (var x : s) if (t < x.length()) t = (byte) x.length();
        for (int k = 0; k < t; k++) {
            char c;
            if (s[0].length() > k) c = s[0].charAt(k);
            else return r.toString();
            for (int i = 1; i < s.length; i++) if (s[i].length() <= k || s[i].charAt(k) != c) return r.toString();
            r.append(c);
        }
        return r.toString();
    }

    public static void main(String[] Args) {
        System.out.println("Result:\n"+Solution.function("", "b"));
    }
}