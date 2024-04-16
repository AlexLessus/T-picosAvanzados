import java.awt.event.*;

import javax.swing.JFrame;

public class EjemploEventoVentana1 extends JFrame implements WindowListener {
    public EjemploEventoVentana1() {
        setBounds(100, 100, 400, 400);
        addWindowListener(this);
        setVisible(true);

    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new EjemploEventoVentana1();
    }

}
