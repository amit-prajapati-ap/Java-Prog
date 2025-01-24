package Collection_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is Date
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is Format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(df2);
//        System.out.println(df);
        String mydate = dt.format(df); // Creating Date string using Date and format
        System.out.println(mydate);
    }
}
