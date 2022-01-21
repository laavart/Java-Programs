import java.io.*;

public class s20220121_2 {
    /**
     * Problem with this method is it does not take the object as a whole for input
     */
    public static void main(String[] Args){
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        //TestObj from s20220121_1.java
        try{
            TestObj tO = new TestObj();

            tO.oSr = Integer.parseInt(bRead.readLine());
            tO.oName = bRead.readLine();
            tO.oRel = Boolean.parseBoolean(bRead.readLine());

            FileOutputStream fOS = new FileOutputStream("OutFiles\\s20220121_2.txt");
            DataOutputStream dOS = new DataOutputStream(fOS);

            dOS.writeInt(tO.oSr);
            dOS.writeUTF(tO.oName);
            dOS.writeBoolean(tO.oRel);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            TestObj tO = new TestObj();

            FileInputStream fIS = new FileInputStream("OutFiles\\s20220121_2.txt");
            DataInputStream dIS = new DataInputStream(fIS);

            /**
             * As show here we need to pick the values one by one
             */
            tO.oSr = dIS.readInt();
            tO.oName = dIS.readUTF();
            tO.oRel = dIS.readBoolean();

            System.out.println(tO.oSr+"\t"+tO.oName+"\t"+tO.oRel);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
