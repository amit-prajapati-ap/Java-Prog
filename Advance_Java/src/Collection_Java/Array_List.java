package Collection_Java;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(5);
        l1.add(3);
        l1.add(6);
        l1.add(7);
        l1.add(2);
        l1.add(6);
        l2.add(21);
        l2.add(25);
        l2.add(55);
        l2.addLast(88);
        System.out.println(l1.contains(10));
        System.out.println(l1.contains(7));
//        l1.addAll(l2);
        l1.addAll(0,l2);
//        l1.clear();
        System.out.println(l1.indexOf(7));
        System.out.println(l1.indexOf(21));
        System.out.println(l1.indexOf(88));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        for (int i = 0 ; i < l1.size() ; i++) {
            System.out.print(l1.get(i) + " , ");
        }
        System.out.println();
        l1.remove(6);
        l1.set(1,1898);
        for (int i = 0 ; i < l1.size() ; i++) {
            System.out.print(l1.get(i) + " , ");
        }
    }
}
