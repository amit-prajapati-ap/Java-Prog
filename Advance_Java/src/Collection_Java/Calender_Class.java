package Collection_Java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender_Class {
    // It is a Abstract Class
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());

        //Gregorian Calender
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        for(int i = 0 ; i < 100 ; i++) {
//            System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//        }
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));
        System.out.println(g.isLeapYear(2022));
        System.out.println(TimeZone.getAvailableIDs());
    }
}
