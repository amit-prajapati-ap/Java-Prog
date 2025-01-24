package Collection_Java;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.add(6);
        arr.add(56);
        arr.addFirst(2);
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        arr.removeLast();
        System.out.println(arr.getLast());
    }
}
