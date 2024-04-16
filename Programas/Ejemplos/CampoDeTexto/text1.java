package CampoDeTexto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class text1 extends JFrame {
    String str = "";
    String strName = "";
    String strPass = "";

    public text1() {
        setLayout(new GridLayout(2, 2));
        TextField name = new TextField(30);
        TextField pass = new TextField(5);

        JLabel lbl = new JLabel("Name");
        JLabel lbl2 = new JLabel("Password");

        add(lbl);
        add(name);
        add(lbl2);
        add(pass);

        name.addActionListener((e) -> {
            strName = name.getText();
            repaint();
        });
        pass.addActionListener((e) -> {
            strPass = pass.getText();
            repaint();
        });

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(strName, 100, 100);
        g.drawString(strPass, 100, 150);
    }

    public static void main(String[] args) {
        new text1();
    }
}
