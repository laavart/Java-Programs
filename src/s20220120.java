import java.io.*;

public class s20220120 {
    public static void main(String[] Args) throws IOException{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        if(new File("OutFiles").mkdir()) System.out.println("Folder Created...");
        try(FileOutputStream fOS = new FileOutputStream("OutFiles/s20220120.txt")) {
            byte[] bA = bRead.readLine().getBytes();
            fOS.write(bA);
        }
        try(FileInputStream fIS = new FileInputStream("OutFiles/s20220120.txt")) {
            byte[] bA = fIS.readNBytes(fIS.available()-1);
            System.out.println(new String(bA));
        }
    }
}
