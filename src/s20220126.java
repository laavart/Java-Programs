import java.util.Date;

/**
 * Date class is depreciated, its starting year is 1900
 * And date is store in form of milliseconds passed from Jan/1/1970
 */
public class s20220126 {
    public static void main(String... Args) {

        System.out.println("Milliseconds passed from Jan/1/1970: "+ System.currentTimeMillis());
        System.out.println("Years passed from Jan/1/1970: " + System.currentTimeMillis()/1000/60/60/24/365.25);


        Date d = new Date();

    }
}
