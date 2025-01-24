class Thread1 extends Thread {
    public String Greet;
    public void run() {
        for(int i = 0; i < 100 ; i++) {
            System.out.println(Greet);
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Thread2 implements Runnable {
    public String Greet;
    public void run() {
        for(int i = 0; i < 100 ; i++) {
            System.out.println(Greet);
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Thread_Excercise {
    public static void main(String[] args) {
        // Thread Class
        Thread1 th1 = new Thread1();
        th1.Greet = "Good Morning";
        Thread1 th2 = new Thread1();
        th2.Greet = "Welcome";
        th1.start();
        th2.start();
//        // Runnable Interface
//        Thread2 th1 = new Thread2();
//        th1.Greet = "Good Morning";
//        Thread t1 = new Thread(th1);
//        Thread2 th2 = new Thread2();
//        th2.Greet = "Welcome";
//        Thread t2 = new Thread(th2);
//        t1.start();
//        t2.start();
    }
}
