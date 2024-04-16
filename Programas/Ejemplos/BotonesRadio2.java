import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonesRadio2 extends JFrame implements ItemListener {
    Checkbox b1, b2, b3;

    public BotonesRadio2() {
        Box b = Box.createVerticalBox();
        CheckboxGroup gpo = new CheckboxGroup();
        b1 = new Checkbox("Cambio", gpo, false);
        b2 = new Checkbox("Mendaje", gpo, false);
        b3 = new Checkbox("Salir", gpo, false);
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
        if (b1.getState()) {
            getContentPane().setBackground(Color.BLUE);
        }
        if (b2.getState()) {
            JOptionPane.showMessageDialog(this, "Felices vacaciones");
            getContentPane().setBackground(Color.white);
        }
        if (b3.getState()) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new BotonesRadio2();
    }

}
