class Mythread7 extends Thread {
    public Mythread7(String name) {
        super(name);
    }
    public void run() {
        for(int i = 0 ; i < 50 ; i++) {
            System.out.println("It is Thread " + getName());
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
//          System.out.println("It is Thread " + this.getName());
    }
}
class Mythread8 implements Runnable {
    public void run() {
        for (int i = 0 ; i < 50 ; i++) {
            System.out.println("Runnable Thread");
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        Mythread7 my1 = new Mythread7("Amit");
        Mythread7 my2 = new Mythread7("Hardik");
//        my1.start();
//        try {
//            my1.join();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        my2.start();
        my1.start();
        my2.start();
    }
}
