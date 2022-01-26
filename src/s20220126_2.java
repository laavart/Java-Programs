import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Calendar is an abstract class
 */
public class s20220126_2 {
    public static void main(String... Args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.getTimeInMillis());

        /**
         * GregorianCalendar is mutable
         * Hence, we can change date and time of the instance/object
         */
        g.set(2020,6,17);
        System.out.println(g.getTimeInMillis());

        /**
         * Checks if the entered year is a Leap year or not
         */
        System.out.println(g.isLeapYear(1993));

        /**
         * returns date starting from 1st of the month
         */
        System.out.println(g.get(Calendar.DATE));
        System.out.println(g.get(Calendar.DAY_OF_MONTH));

        /**
         * returns date starting from 1st of january of the year
         */
        System.out.println(g.get(Calendar.DAY_OF_YEAR));

        /**
         * Takes actual week beginnings
         */
        System.out.println(g.get(Calendar.DAY_OF_WEEK));

        /**
         * Takes week starting from 1st of the month
         */
        System.out.println(g.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(g.get(Calendar.MONTH));
        System.out.println(g.get(Calendar.YEAR));

        /**
         * We cannot create TimeZone
         * But we can get it
         */
        TimeZone t = g.getTimeZone();
        System.out.println(t);

        /**
         * returns name of TimeZone
         */
        System.out.println(t.getDisplayName());

        /**
         * returns ID i.e., Asia/Kolkata
         */
        System.out.println(t.getID());
    }
}
