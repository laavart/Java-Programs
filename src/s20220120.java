import java.io.*;

public class s20220120 {
    public static void main(String[] Args) throws IOException{
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        /**
         * To Create a new Folder
         */
        //if(new File("OutFiles").mkdir()) System.out.println("Folder Created...");

        try(FileOutputStream fOS = new FileOutputStream("OutFiles/s20220120.txt")) {
            byte[] bA = bRead.readLine().getBytes();
            fOS.write(bA);
        }

        try(FileInputStream fIS = new FileInputStream("OutFiles/s20220120.txt")) {
            byte[] bA = fIS.readNBytes(fIS.available()-1);
            System.out.println(new String(bA));
        }

        try(FileWriter fW = new FileWriter("OutFiles/s20220120.txt")) {
            fW.write(bRead.readLine());
        }

        try(FileReader fR = new FileReader("OutFiles/s20220120.txt")) {
            int c;
            while( (c=fR.read()) != -1) System.out.print( (char)c );
        }
    }
}
