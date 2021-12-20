import java.io.BufferedReader;
import java.io.InputStreamReader;

public class d1220 {

    // This function removes vowels from the sentence using recursions.
    // Does not use HashSet because it calls a library to the build and uses more memory.
    static void removeVowels(String s, StringBuilder r, int n){
        // Checking that index value does not exceed
        if(n < s.length()){
            // Storing character at index, so we don't have to use function everytime
            char c = s.charAt(n);
            // Checking for vowels
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
                // If not a vowel just append it to result
                r.append(c);
            // Repeat for next index
            removeVowels(s, r, ++n);
        }
    }

    public static void main(String[] Args) throws Exception{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder r = new StringBuilder();
        removeVowels(bRead.readLine(), r, 0);
        System.out.println(r);
    }
}
