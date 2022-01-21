import java.io.*;

class TestObj{
    public int oSr;
    public String oName;
    public Boolean oRel;
}

public class s20220121_1 {
    /**
     * Problem with this method is it does not preserve datatype
     */
    public static void main(String[] Args){
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));

        try{
            TestObj tO = new TestObj();

            tO.oSr = Integer.parseInt(bRead.readLine());
            tO.oName = bRead.readLine();
            tO.oRel = Boolean.parseBoolean(bRead.readLine());

            FileOutputStream fOS = new FileOutputStream("OutFiles\\s20220121_1.txt");
            PrintStream pS = new PrintStream(fOS);

            pS.println(tO.oSr);
            pS.println(tO.oName);
            pS.println(tO.oRel);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            TestObj tO = new TestObj();

            FileInputStream fIS = new FileInputStream("OutFiles\\s20220121_1.txt");
            BufferedReader bR = new BufferedReader(new InputStreamReader(fIS));

            /**
             * As show here we need to covert it back to the usable type
             */
            tO.oSr = Integer.parseInt(bR.readLine());
            tO.oName = bR.readLine();
            tO.oRel = Boolean.parseBoolean(bR.readLine());

            System.out.println(tO.oSr+"\t"+tO.oName+"\t"+tO.oRel);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
