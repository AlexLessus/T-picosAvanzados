package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout6 extends Panel {
    public EjemploLayout6() {
        add(new Button("b1"));
        add(new Button("b2"));
        add(new Button("b3"));
        add(new Button("b4"));
        add(new Button("b5"));
        add(new Button("b6"));
        setLayout(new GridLayout(3, 2));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Ejemplo4");
        f.setBounds(100, 100, 600, 400);
        Panel p = new Panel();
        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p.add(new Button("B6"));
        p.add(new Button("B7"));
        p.add(new Button("B8"));

        f.add(p, "North");
        f.setBackground(Color.black);
        f.add(new EjemploLayout6());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

}
