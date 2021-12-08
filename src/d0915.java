import java.io.*;

public class d0915 {
    static InputStreamReader iStream = new InputStreamReader(System.in);
    static BufferedReader bRead = new BufferedReader(iStream);

    static void recursionTesting(int n){
        if(n!=0){
            recursionTesting(n/10);
            System.out.println(n%10);
        }
    }

    public static void main(String[] Args) throws Exception{

        int n = Integer.parseInt(bRead.readLine());
        recursionTesting(n);

        iStream.close();
        bRead.close();
    }
}
