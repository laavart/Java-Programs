import java.util.Date;

/**
 * Date class is depreciated, its starting year is 1900
 */
public class s20220126 {
    public static void main(String... Args) {

        /**
         * System.currentTimeMillis() returns a LONG value
         * that is milliseconds passed from Jan/1/1970
         */
        System.out.println("Milliseconds passed from Jan/1/1970: "+ System.currentTimeMillis());
        System.out.println("Years passed from Jan/1/1970: " + System.currentTimeMillis()/1000/60/60/24/365.25);
        System.out.println("Max date/time possible from Jan/1/1970: " + Long.MAX_VALUE/1000/60/60/24/365.25);

        /**
         * date() => takes current date and time
         * date(S) => takes S as date and time, S => "Month/Date/Year Hour:Minute:Seconds"
         */
        Date d = new Date("6/19/2020 00:20:00");
        System.out.println(d);

        /**
         * Date is based on milliseconds
         */
        System.out.println(d.getTime());
        /**
         * Week from 0 (Sunday) to 6 (Saturday)
         */
        System.out.println(d.getDay());

        System.out.println(d.getDate());

        /**
         * Month from 0 (Jan) to 11 (Dec)
         */
        System.out.println(d.getMonth());

        /**
         * Original Year = d.getYear()+1900
         */
        System.out.println(d.getYear());
        System.out.println(d.getYear()+1900);

        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());

        /**
         * Shows time according to GMT
         */
        System.out.println(d.toGMTString());

        /**
         * Shows difference/offset between IST and GMT
         * returns GMT - IST, i.e., -5.30hrs = -(5(60)+30) = -330
         */
        System.out.println(d.getTimezoneOffset());
    }
}
