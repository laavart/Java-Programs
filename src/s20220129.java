import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Networking
 * Reverse Echo Server
 */

class Server {
    public static void main(String[] Args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader stkIn = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream stkOut = new PrintStream(stk.getOutputStream());

        String msg;

        do{
            msg = stkIn.readLine();

            StringBuilder s = new StringBuilder(msg);
            s.reverse();

            stkOut.println(s);
        }
        while(!msg.equalsIgnoreCase("end"));

        stk.close();
        stkOut.close();

        stk.close();
        ss.close();
    }
}

/**
 * Client
 */
class Client {
    public static void main(String[] Args) throws IOException {
        Socket stk = new Socket("localhost",2000);

        BufferedReader stkIn = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream stkOut = new PrintStream(stk.getOutputStream());

        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        do{
            msg = bRead.readLine();

            stkOut.println(msg);
            msg = stkIn.readLine();

            System.out.println("From Server: "+msg);
        }
        while(!msg.equalsIgnoreCase("dne"));

        stk.close();
        stkOut.close();

        stk.close();

        bRead.close();
    }
}
