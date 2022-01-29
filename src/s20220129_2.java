import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class MultiThreadedServer {
    public static void main(String[] Args) throws IOException{
        ServerSocket server = new ServerSocket(2000);

        do{
            Socket socket = server.accept();
            SocketThread s = new SocketThread(socket);
            s.start();
        }
        while(true);
    }
}

class SocketThread extends Thread{

    Socket stk;

    public SocketThread(Socket s) {
        this.stk = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader stkIn = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream stkOut = new PrintStream(stk.getOutputStream());

            String msg;

            do {
                msg = stkIn.readLine();

                StringBuilder s = new StringBuilder(msg);
                s.reverse();

                stkOut.println(s);
            }
            while (!msg.equalsIgnoreCase("end"));

            stk.close();
            stkOut.close();

            stk.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

public class s20220129_2 {
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
