import java.awt.event.*;

import javax.swing.JFrame;

public class EjemploEventoVentana2 extends JFrame {
    public EjemploEventoVentana2() {
        setBounds(100, 100, 400, 400);
        // addWindowListener(new CerrarVentana());
        // addWindowListener(new CerrarVentana2());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new EjemploEventoVentana2();
    }

}
