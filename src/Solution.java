import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    static int function(String s) {
        final List<Character> a = new ArrayList<>(List.of('I', 'V', 'X', 'L', 'C', 'D', 'M'));
        int l = s.length();
        int r = 0;
        byte t = 0;
        while (l-- > 0) {
            char c = s.charAt(l);
            switch (c) {
                case 'I' -> {
                    if (t > a.indexOf('I')) r-=1;
                    else r+=1;
                }
                case 'V' -> {
                    r += 5;
                    t = 1;
                }
                case 'X' -> {
                    if (t > a.indexOf('X')) r -= 10;
                    else {
                        r += 10;
                        t = 2;
                    }
                }
                case 'L' -> {
                    r += 50;
                    t = 3;
                }
                case 'C' -> {
                    if (t > a.indexOf('C')) r -= 100;
                    else {
                        r += 100;
                        t = 4;
                    }
                }
                case 'D' -> {
                    r += 500;
                    t = 5;
                }
                case 'M' -> {
                    r += 1000;
                    t = 6;
                }
            }
        }
        return r;
    }

    public static void main(String[] Args) {
        while (true)
            System.out.println(Solution.function(
                    new Scanner(System.in).nextLine()
            ));
    }
}