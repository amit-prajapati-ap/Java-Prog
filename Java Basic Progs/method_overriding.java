
class A {
    public void print() {
        System.out.println("Base Class");
    }
}
class B extends A {
    @Override
    public void print() {
        System.out.println("Derived Class");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B d = new B();
        d.print();
    }
}
