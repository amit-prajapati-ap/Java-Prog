package AWT_Examples;
import java.awt.*;
public class MyFrame1 {
    public static void main(String[] args) {
        Frame f = new Frame("This is My Frame");
        f.setSize(400,300);
        f.setVisible(true);
        f.setLayout(null);
        Label l1 = new Label("First Name");
        Label l2 = new Label("Last Name");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button b = new Button("Submit");
        l1.setBounds(20,45,70,30);
        t1.setBounds(90,50,100,25);
        l2.setBounds(20,75,70,30);
        t2.setBounds(90,80,100,25);
        b.setBounds(20,120,80,30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
    }
}
