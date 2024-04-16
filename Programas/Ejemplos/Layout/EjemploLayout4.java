package Layout;

import java.awt.*;
import java.awt.event.*;

public class EjemploLayout4 extends Panel {
    public EjemploLayout4() {
        add(new Button("B1"));
        add(new Button("B2"));
        add(new Button("B3"));
    }

    public static void main(String[] args) {
        Frame f = new Frame("Ejemplo4");
        f.setBounds(100, 100, 600, 400);
        f.setBackground(Color.black);
        f.add(new EjemploLayout4());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

}
