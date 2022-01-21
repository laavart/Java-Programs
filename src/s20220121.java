import java.io.*;

class Producer extends Thread{
    OutputStream oS;
    Producer(OutputStream o){
        oS = o;
    }
    public void run(){
        int count = 1;
        while(true){
            try {
                oS.write(count);
                oS.flush();
                System.out.println("Producer produced : " + count);
                System.out.flush();
                Thread.sleep(100);
                count++;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{
    InputStream iS;
    Consumer(InputStream i){
        iS = i;
    }
    public void run() {
        int x;
        while(true){
            try {
                x = iS.read();
                System.out.println("Consumer consumed : "+x);
                Thread.sleep(100);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class s20220121 {
    public static void main(String[] Args) throws IOException {
        PipedInputStream pIS = new PipedInputStream();
        PipedOutputStream pOS = new PipedOutputStream();

        /**
         * can also be
         * pOS.connect(pIS);
         */
        pIS.connect(pOS);

        Producer p = new Producer(pOS);
        Consumer c = new Consumer(pIS);

        p.start();
        c.start();
    }
}
