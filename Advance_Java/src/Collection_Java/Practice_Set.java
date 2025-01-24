package Collection_Java;

import java.util.*;

public class Practice_Set {
    public static void main(String[] args) {
//        // Q1
//        ArrayList arr = new ArrayList();
//        arr.add("Amit");
//        arr.add("Hardik");
//        arr.add("Jatin");
//        arr.add("Sandeep");
//        arr.add("Nakul");
//        for (Object a : arr) {
//            System.out.println(a + " ");
//        }
//        // Q2
//        HashSet<Integer> s= new HashSet<>();
//        s.add(5);
//        s.add(4);
//        s.add(6);
//        s.add(2);
//        s.add(5);
//        System.out.println(s);
//        // Q3
//        Date d = new Date();
//        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());
        // Q4
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
    }
}
