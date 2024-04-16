package Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjemploLayout3 extends JFrame {
    public EjemploLayout3() {
        setLayout(null);
        setBounds(100, 100, 600, 400);
        setBackground(Color.LIGHT_GRAY);
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Label l1 = new Label("L1");
        Label l2 = new Label("L2");
        Label lNombre = new Label("Alexis De Jesus");
        Label lNc = new Label("22290827");
        Label lSemestre = new Label("4 semestre");
        Label lCarrera = new Label("Sistemas Comutacionales");
        b1.setBounds(50, 50, 70, 50);
        b2.setBounds(50, 100, 70, 50);
        b3.setBounds(50, 150, 70, 50);
        l1.setBounds(500, 50, 50, 30);
        l2.setBounds(500, 100, 50, 30);

        lNombre.setBounds(250, (int) (getBounds().height * .8), 100, 30);
        lNc.setBounds(250, (int) (getBounds().height * .7), 80, 30);
        lCarrera.setBounds(250, (int) (getBounds().height * .6), 150, 30);
        lSemestre.setBounds(250, (int) (getBounds().height * .5), 150, 30);

        Font f = new Font("arial", Font.BOLD, 12);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(f);
        b2.setBackground(Color.green);
        b2.setForeground(Color.WHITE);
        b2.setFont(f);
        b3.setBackground(Color.blue);
        b3.setForeground(Color.WHITE);
        b3.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        lNombre.setBackground(Color.BLACK);
        lNombre.setForeground(Color.WHITE);
        lNombre.setFont(f);
        lNc.setBackground(Color.BLACK);
        lNc.setForeground(Color.WHITE);
        lNc.setFont(f);
        lCarrera.setBackground(Color.BLACK);
        lCarrera.setForeground(Color.WHITE);
        lCarrera.setFont(f);
        lSemestre.setBackground(Color.BLACK);
        lSemestre.setForeground(Color.WHITE);
        lSemestre.setFont(f);

        add(b1);
        add(b2);
        add(b3);
        add(l1);
        add(l2);
        add(lNombre);
        add(lCarrera);
        add(lNc);
        add(lSemestre);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploLayout3();
    }

}
