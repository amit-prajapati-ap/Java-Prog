class base {

    int x;
    public base() {
        System.out.println("Base Class Default Constructor");
    }
    public base(int x) {
        System.out.println("Base Constuctor");
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base {
    int y;
    public derived() {
        System.out.println("Derived Class Default Constructor");
    }
    public derived(int x, int y) {
        super(x);
        System.out.println("Derived Constructor");
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
//            derived d = new derived();
//            d.print();
//            base b = new base();
//            System.out.println(b.getX());
//                b.setX(5);
//            System.out.println(b.getX());
//            d.x = 2;
//            System.out.println(d.getX());
//              base b = new base();
              derived d = new derived();
    }
}
