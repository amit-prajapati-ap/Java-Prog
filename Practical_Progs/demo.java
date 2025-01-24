// Types of variables
public class demo {
    int x;
    static int y;
    public static void test() {
        int z = 3;
        System.out.println("z = " + z);
    }
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();
        d1.x = 5;
        d2.x = 2;
        demo.y = 8;
        demo.test();
        System.out.println("x1 = " + d1.x);
        System.out.println("x2 = " + d2.x);
        System.out.println("y = " + demo.y);
    }
}