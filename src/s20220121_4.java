import java.io.*;

public class s20220121_4 {
    public static void main(String[] Args){
        /**
         * in RandomAccessFile you can use the benefit of index like arrays
         *  rw => read-write
         */
        try {
            BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

            RandomAccessFile rAF = new RandomAccessFile("OutFiles\\s20220121_4.txt", "rw");

            rAF.writeBytes(bRead.readLine());

            /**
             * seek(pos) moves to the index "pos"
             * we need to seek because the pointer wil currently be at "!"
             * because we write till it
             */
            rAF.seek(0);

            /**
             * Updating and checking can be done at section by using ()
             */
            int c;
            while( (c = rAF.read()) != ' '){
                System.out.println((char) c);
            }

            /**
             * getFilePointer() gives current pointer position
             */
            System.out.println(rAF.getFilePointer());
            System.out.println(rAF.readLine());

            /**
             * length() returns the size of the file in "Bytes"
             */
            System.out.println("Length of File : "+rAF.length());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
