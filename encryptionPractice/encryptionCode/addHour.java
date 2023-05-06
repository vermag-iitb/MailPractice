import java.util.Calendar;
import java.util.Date;

public class addHour
{
    public static void main(String args[]) throws Exception
    {
        Date cd = new Date();
        System.out.println(cd);
        long t1 = cd.getTime();
        System.out.println(t1);
        System.out.println(new Date(t1+2000));
//        System.out.println(exp.getClass());

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date());               // sets calendar time/date
        System.out.println(cal.getTime());
        cal.add(Calendar.HOUR_OF_DAY, 5);      // adds one hour
        System.out.println(cal.getTime());
        System.out.println(cal.getClass());
        Date expDate = cal.getTime();
        System.out.println(expDate.getClass());
    }
}