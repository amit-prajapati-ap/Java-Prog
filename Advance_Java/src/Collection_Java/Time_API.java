package Collection_Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_API {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);
    }
}
