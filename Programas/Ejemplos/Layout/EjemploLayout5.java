package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout5 extends Panel {
    public EjemploLayout5() {
        Panel p = new Panel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        p.add(new Button("B4"));
        p.add(new Button("B5"));

        setLayout(new BorderLayout());
        add(new Button("B1"), "West");
        add(new Button("B2"), "Center");
        add(new Button("B3"), "East");
        add(p, "South");
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
        f.add(new EjemploLayout5());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

}
