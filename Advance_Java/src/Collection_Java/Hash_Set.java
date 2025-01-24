package Collection_Java;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(30,0.5f);
        h.add(5);
        h.add(3);
        h.add(11);
        h.add(11);
        h.add(6);
        System.out.println(h);
    }
}
