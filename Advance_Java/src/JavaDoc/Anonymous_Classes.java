package JavaDoc;

//class MyFuction implements DemoAno {
//    @Override
//    public void meth1() {
//        System.out.println("Meth 1");
//    }
//}
interface DemoAno {
    void meth1(int a);
//    void meth2();
}
//class AnonyDemo implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("Demo 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("Demo 2");
//    }
//    public void display() {
//        System.out.println("Hello");
//    }
//}
public class Anonymous_Classes {
    public static void main(String[] args) {
//        AnonyDemo obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();
//        // Reference of Interface But Object Of Class
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();
//        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("Meth 1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("Meth 2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();
//        // Lambda Expressions
//        DemoAno my = new MyFuction();
//        my.meth1();
        DemoAno obj = (a)->{System.out.println("Method 1" + a);};
        obj.meth1(5);
    }
}