import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonesRadio3 extends JFrame implements ItemListener {
    JRadioButton b1, b2, b3;

    public BotonesRadio3() {
        Box b = Box.createVerticalBox();
        ButtonGroup gpo = new ButtonGroup();
        b1 = new JRadioButton("Cambio");
        b2 = new JRadioButton("Mendaje");
        b3 = new JRadioButton("Salir");
        b.add(b1);
        b.add(b2);
        b.add(b3);
        add(b, "West");
        gpo.add(b1);
        gpo.add(b2);
        gpo.add(b2);
        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
        setSize(400, 300);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        if (b1.isSelected()) {
            getContentPane().setBackground(Color.BLUE);
        }
        if (b2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Felices vacaciones");
            getContentPane().setBackground(Color.white);
        }
        if (b3.isSelected()) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new BotonesRadio3();
    }

}
