import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TCS_CodeVita_A {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        int l1 = s1.length();
        ArrayList<Character> u1 = new ArrayList<>();

        String s2 = scan.nextLine();
        int l2 = s2.length();
        HashMap<Character, Integer> u2 = new HashMap<>();

        StringBuilder res = new StringBuilder();

        for(int i=0; i<l2; i++){
            char c = Character.toLowerCase(s2.charAt(i));
            if(u2.containsKey(c)) u2.replace(c, u2.get(c)+1);
            else u2.put(c,1);
        }

        StringBuilder num = new StringBuilder();
        for(int i=0; i<l1; i++){
            char c = Character.toLowerCase(s1.charAt(i));

            if (u1.contains(c)) {
                System.out.println("New Language Error");
                return;
            }
            else{
                u1.add(c);
                if(u2.containsKey(c)){
                    int l = u2.get(c);
                    if(Character.isDigit(c)) for(int j=0; j<l; j++) num.append(c);
                    else for(int j=0; j<l; j++) res.append(c);
                }
            }
        }

        res.append(num);

        int l = res.length();
        for(int i=0; i<Math.min(l,l2); i++)
            if(s2.charAt(i) == ' ')
                res.insert(i-1,' ');

        System.out.println(res);
    }
}
