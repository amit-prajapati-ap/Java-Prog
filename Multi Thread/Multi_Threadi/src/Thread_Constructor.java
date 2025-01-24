class Mythread3 extends Thread {
    public Mythread3(String name) {
        super(name);
    }
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("It is Thread");
        }
    }
}
class Mythread4 implements Runnable {
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("Runnable Thread");
        }
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
//        Mythread3 m = new Mythread3("Amit");
//        Mythread3 n = new Mythread3("Hardik");
//        m.start();
//        n.start();
        Mythread4 my1 = new Mythread4();
        Thread m = new Thread(my1,"Amit");
        Mythread4 my2 = new Mythread4();
        Thread n = new Thread(my2,"Hardik");
        m.start();
        n.start();
        System.out.println("Thread ID : " + m.getId());
        System.out.println("Thread Name : " + m.getName());
        System.out.println("Thread ID : " + n.getId());
        System.out.println("Thread Name : " + n.getName());
    }
}
