package ToggleButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploToggleButton extends JFrame {
    public EjemploToggleButton() {
        setLayout(new GridLayout(2, 1));
        setTitle("Ejemplo otro tipo de boton");
        JToggleButton b = new JToggleButton("Boton");
        JLabel et = new JLabel(" ");
        et.setHorizontalAlignment(JLabel.CENTER);
        b.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int estado = e.getStateChange();
                if (estado == e.SELECTED) {
                    et.setText("Boton Seleccionado");
                } else {
                    et.setText("Boton Deseleccionado");
                }

            }
        });

        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(et);
        add(b);
        setVisible(true);

    }

    public static void main(String[] args) {
        new EjemploToggleButton();
    }
}
