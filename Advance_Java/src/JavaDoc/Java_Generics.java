package JavaDoc;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2> {
    int val1;
    private T1 t1;
    private T2 t2;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public MyGeneric(int val1, T1 t1, T2 t2) {
        this.val1 = val1;
        this.t1 = t1;
        this.t2 = t2;
    }

}
public class Java_Generics {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
        ArrayList<Integer> al = new ArrayList();
//        al.add("str1");
        al.add(54);
        al.add(765);
//        al.add(new Scanner(System.in));
        // Typecasting
//        int a = (int)al.get(2);
//        int a = al.get(2);
        int a = (int)al.get(0);
//        System.out.println(a);
        MyGeneric<String,Double> g1 = new MyGeneric(56,"Amit",54.23);
        String str = g1.getT1();
        Double f = g1.getT2();
        System.out.println(str);
        System.out.println(f);
    }
}
