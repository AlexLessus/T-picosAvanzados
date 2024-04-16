import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Casillas3 extends JFrame implements ItemListener {
    JCheckBox b1, b2, b3;

    public Casillas3() {
        Box b = Box.createVerticalBox();
        getContentPane().setBackground(Color.BLUE);
        b1 = new JCheckBox("Cambio", true);
        b2 = new JCheckBox("Mendaje");
        b3 = new JCheckBox("Salir");
        b.add(b1);
        b.add(b2);
        b.add(b3);
        add(b, "West");
        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
        setSize(400, 300);
        setVisible(true);

    }

    public void itemStateChanged(ItemEvent e) {
        if (b1.isSelected()) {
            getContentPane().setBackground(Color.BLUE);
        } else {
            getContentPane().setBackground(Color.white);
        }
        if (b2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Felices vacaciones");
        }
        if (b3.isSelected()) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Casillas3();
    }

}
