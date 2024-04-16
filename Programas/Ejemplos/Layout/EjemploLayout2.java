package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout2 extends JFrame {
    public EjemploLayout2() {
        setLayout(new FlowLayout());
        setBounds(100, 100, 600, 400);
        add(new JButton("B1"));
        add(new JButton("B2"));
        add(new JButton("B3"));
        add(new JLabel("L1"));
        add(new JLabel("L2"));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploLayout2();
    }

}
