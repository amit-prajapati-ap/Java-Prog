package Collection_Java;

import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
//        Date d = new Date(2020 - 1900,11,26,5,20,34);
//        System.out.println(d); // Prints Current Date
        Date d = new Date(121,11,26,5,20,34);
        System.out.println(d); // Prints Current Date
        System.out.println("Milliseconds : " + d.getTime());
        System.out.println("Date : " + d.getDate());
        System.out.println("Seconds : " + d.getSeconds());
        System.out.println("Year : " + d.getYear());
    }
}
