import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumAWT {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        TextField t1 = new TextField();
        t1.setBounds(20,50,120,30);
        TextField t2 = new TextField();
        t2.setBounds(20,90,120,30);
        TextField t3 = new TextField();
        t3.setBounds(20,130,120,30);
        TextField t4 = new TextField();
        t4.setBounds(200,70,120,30);
        Label l = new Label("Result");
        l.setBounds(200,40,120,30);
        Button b1 = new Button("Sum");
        b1.setBounds(20,170,120,30);
        Button b2 = new Button("Average");
        b2.setBounds(150,170,120,30);
        Button b3 = new Button("Multiply");
        b3.setBounds(280,170,120,30);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = t1.getText();
                int num1 = Integer.parseInt(str);
                str = t2.getText();
                int num2 = Integer.parseInt(str);
                str = t3.getText();
                int num3 = Integer.parseInt(str);
                String output = Integer.toString(num1 + num2 + num3);
                t4.setText(output);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = t1.getText();
                int num1 = Integer.parseInt(str);
                str = t2.getText();
                int num2 = Integer.parseInt(str);
                str = t3.getText();
                int num3 = Integer.parseInt(str);
                String output = Integer.toString((num1 + num2 + num3) / 3);
                t4.setText(output);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = t1.getText();
                int num1 = Integer.parseInt(str);
                str = t2.getText();
                int num2 = Integer.parseInt(str);
                str = t3.getText();
                int num3 = Integer.parseInt(str);
                String output = Integer.toString(num1 * num2 * num3);
                t4.setText(output);
            }
        });

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setSize(500, 300);
        f.setVisible(true);
    }
}
