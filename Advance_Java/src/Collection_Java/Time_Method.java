package Collection_Java;

public class Time_Method {
    public static void main(String[] args) {
        System.out.println("Milliseconds Since 1 Jan 1970 : " + System.currentTimeMillis()); // Current Time Milliseconds From 1 January 1970
        System.out.println("Seconds Since 1 Jan 1970 : " + System.currentTimeMillis() / 1000); // Current Time Seconds From 1 January 1970
        System.out.println("Minutes Since 1 Jan 1970 : " + System.currentTimeMillis() / 1000 / 60); // Current Time Minutes From 1 January 1970
        System.out.println("Hours Since 1 Jan 1970 : " + System.currentTimeMillis() / 1000 / 60 / 60); // Current Time Hours From 1 January 1970
        System.out.println("Days Since 1 Jan 1970 : " + System.currentTimeMillis() / 1000 / 60 / 60/ 24); // Current Time Days From 1 January 1970
        System.out.println("Years Since 1 Jan 1970 : " + System.currentTimeMillis() / 1000 / 60 / 60/ 24 / 365); // Current Time years From 1 January 1970
        System.out.println("Maximum Value Of Long : " + Long.MAX_VALUE);
        System.out.println("Maximum Value Of Milli : " + System.currentTimeMillis());
    }
}
