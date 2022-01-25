import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties inherits from Hashtable
 * It is not generic, and both keys & values are STRING
 */
public class s20220125_2 {
    public static void main(String... Args) throws IOException {
        Properties p = new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("CPU", "Intel i5 8th Gen");
        p.setProperty("GPU", "Nvidia GTX 1050");
        p.setProperty("RAM", "16 GB");
        p.setProperty("Colour", "Black");
        System.out.println(p);

        /**
         * Stores all the entries to a file
         */
        p.store(new FileOutputStream("OutFiles\\s20220125_2.txt"), "My Laptop");

        /**
         * Stores all the entries to XML file
         */
        p.storeToXML(new FileOutputStream("OutFiles\\s20220125_2.xml"), "My Laptop");

        /**
         * Loads the entries from a file
         */
        Properties f = new Properties();
        f.load(new FileInputStream("OutFiles\\s20220125_2.txt"));
        System.out.println("From File: "+f);

        /**
         * Loads the entries from XML file
         */
        Properties x = new Properties();
        x.loadFromXML(new FileInputStream("OutFiles\\s20220125_2.xml"));
        System.out.println("From XML: "+x);
    }
}
