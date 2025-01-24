class Mythread5 extends Thread {
    public Mythread5(String name) {
        super(name);
    }
    public void run() {
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("It is Thread " + this.getName());
        }
//          System.out.println("It is Thread " + this.getName());
    }
}
class Mythread6 implements Runnable {
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("Runnable Thread");
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        Mythread5 my1 = new Mythread5("Amit (Most Important)");
        Mythread5 my2 = new Mythread5("Hardik");
        Mythread5 my3 = new Mythread5("Jatin (Min)");
        Mythread5 my4 = new Mythread5("Sardar");
        Mythread5 my5 = new Mythread5("Nakul");
        my1.setPriority(Thread.MAX_PRIORITY);
        my3.setPriority(Thread.MIN_PRIORITY);
        my2.setPriority(Thread.NORM_PRIORITY);
        my4.setPriority(Thread.MIN_PRIORITY);
        my5.setPriority(Thread.MIN_PRIORITY);
        my1.start();
        my2.start();
        my3.start();
        my4.start();
        my5.start();
    }
}
