import java.io.*;

/**
 * --------------MUST--------------
 * Implements Serializable to work
 */
class TestObject implements Serializable {
    public int oSr;
    public String oName;
    public boolean oRel;
    public float oPer;
    /**
     * static values will not be stored
     */
    public static float oS;
    /**
     * transient values will also not be stored
     * transient is a modifies used to store only values needed for short period of time
     */
    public transient int oT;
}

public class s20220121_3 {
    /**
     * Serialization
     */
    public static void main(String[] Args){
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        try{
            TestObject tOj = new TestObject();

            tOj.oSr = Integer.parseInt(bRead.readLine());
            tOj.oName = bRead.readLine();
            tOj.oRel = Boolean.parseBoolean(bRead.readLine());
            tOj.oPer = Float.parseFloat(bRead.readLine());

            FileOutputStream fOS = new FileOutputStream("OutFiles\\s20220121_3.txt");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);

            oOS.writeObject(tOj);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fIS = new FileInputStream("OutFiles\\s20220121_3.txt");
            ObjectInputStream oIS = new ObjectInputStream(fIS);

            /**
             * Throws ClassNotFoundException
             */
            TestObject tOj = (TestObject) oIS.readObject();

            System.out.println(tOj.oSr+"\t"+tOj.oName+"\t"+tOj.oRel+"\t"+tOj.oPer);
        }
        catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
