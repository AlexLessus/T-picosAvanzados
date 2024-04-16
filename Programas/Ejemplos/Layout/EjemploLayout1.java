package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout1 extends Frame {
    public EjemploLayout1() {
        setBounds(100, 100, 600, 600);
        // setLayout(new FlowLayout());
        setBackground(Color.blue);
        // add(Component, Ubicacion) = add(Ubicacion, Componente)
        add("North", new JButton("Boton 1"));
        add(BorderLayout.CENTER, new JButton("Boton 2"));
        add(new JButton("Boton 3"), BorderLayout.SOUTH);
        add("West", new JLabel("Label 1"));
        add("East", new JLabel("Label 2"));
        // Evento al cerrar ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add("South", new Button());
        setVisible(true);

    }

    public static void main(String[] args) {
        new EjemploLayout1();
    }
}
