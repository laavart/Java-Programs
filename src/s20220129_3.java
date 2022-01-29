import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Datagram Communication
 */

class DatagramServer {
    public static void main(String[] Args) throws IOException {
        DatagramSocket socket = new DatagramSocket(2000);
        DatagramPacket packet;
        String s;

        /**
         * Receive
         */
        packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);
        s = (new String(packet.getData())).trim();
        System.out.println("Packet to process: "+s);

        /**
         * Send
         */
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        packet = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("localhost"), 2001);
        socket.send(packet);

        socket.close();
    }
}

class DatagramClient {
    public static void main(String[] Args) throws IOException {
        DatagramSocket socket = new DatagramSocket(2001);
        DatagramPacket packet;
        String s;

        /**
         * Send
         */
        s = "Yahoo!";
        packet = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("localhost"), 2000);
        socket.send(packet);

        /**
         * Receive
         */
        byte[] b = new byte[1024];
        packet = new DatagramPacket(b, 1024);
        socket.receive(packet);
        s = (new String(packet.getData())).trim();
        System.out.println("Packet received: "+s);

        socket.close();
    }
}
