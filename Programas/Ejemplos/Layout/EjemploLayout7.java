package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout7 extends Panel {
    public EjemploLayout7() {
        setLayout(new BorderLayout());
        Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Panel p2 = new Panel(new GridLayout(4, 1, 5, 5));
        Panel p3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        Panel p4 = new Panel(new GridLayout(2, 1, 20, 20));
        Panel p5 = new Panel();
        p5.setLayout(new GridLayout(3, 2, 5, 5));
        Panel p6 = new Panel(new GridLayout(2, 2));

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.green);
        p3.setBackground(Color.BLUE);
        p4.setBackground(Color.green);
        p5.setBackground(Color.red);
        p1.setBackground(Color.orange);

        p1.add(new JButton("B1"));
        p1.add(new JButton("B2"));
        p1.add(new JButton("B3"));

        p2.add(new JLabel("et1"));
        p2.add(new JLabel("et2"));
        p2.add(new JLabel("et3"));
        p2.add(new JLabel("et4"));

        p3.add(new Button("B1"));
        p3.add(new Button("B2"));
        p3.add(new Button("B3"));

        p4.add(new JLabel("et1"));
        p4.add(new JLabel("et2"));

        p5.add(new Button("B1"));
        p5.add(new Button("B2"));
        p5.add(p6);
        p5.add(new Button("B4"));
        p5.add(new Button("B5"));
        p5.add(new EjemploLayout5());

        p6.add(new Button("B1"));
        p6.add(new Button("B2"));
        p6.add(new Button("B3"));
        p6.add(new Button("B4"));

        add("North", p1);
        add("East", p2);
        add("South", p3);
        add("Center", p5);
        add("West", p4);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Ejemplo7");
        f.setBounds(100, 100, 600, 400);

        f.add(new EjemploLayout7());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

}
