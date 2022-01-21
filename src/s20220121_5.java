import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class s20220121_5 {
    public static void main(String[] Args){
        try {
            BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
            File f = new File(bRead.readLine());
            /**
             * getAbsolutePath() returns the path of the file starting from drive
             */
            System.out.println(f.getAbsolutePath());
            /**
             * canRead() checks if the file is readable or not
             */
            System.out.println(f.canRead());
            /**
             * canWrite() checks if the file is editable or not
             */
            System.out.println(f.canWrite());
            /**
             * canExecute() checks if the file is executable or not
             */
            System.out.println(f.canExecute());
            /**
             * createNewFile() creates a new file
             */
            System.out.println(f.createNewFile());
            /**
             * mkdir() creates new directory
             */
            System.out.println(f.mkdir());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
