//Alexis De Jesus Perez Carmona 22290827

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Etiquetas8 extends JFrame {
    JLabel et1, et2, et3, et4, et5, et6, et7, et8;

    public Etiquetas8() {
        setLayout(new GridLayout(2, 4, 20, 10));
        setBackground(Color.DARK_GRAY);
        setBounds(100, 100, 700, 400);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        et1 = new JLabel("Etiqueta 1");
        et1.setForeground(Color.CYAN);
        et1.setBackground(Color.darkGray);
        et1.setOpaque(true);

        et2 = new JLabel("Etiqueta 2", JLabel.CENTER);
        et2.setOpaque(true);
        et2.setBackground(Color.BLACK);
        et2.setForeground(Color.white);

        et3 = new JLabel(new ImageIcon("8Etiquetas\\miFondo.jpg"));
        et3.setToolTipText("Imagen generada en una actividad pasada");
        et3.setBackground(Color.BLACK);
        et3.setOpaque(true);

        et4 = new JLabel("Etiqueta 4", JLabel.RIGHT);
        et4.setBackground(Color.ORANGE);
        et4.setOpaque(true);
        et4.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLoweredBevelBorder(), "Etiqueta 4",
                TitledBorder.CENTER,
                TitledBorder.BELOW_BOTTOM));

        et5 = new JLabel("Etiqueta 5", JLabel.LEADING);
        et5.setBorder(new BevelBorder(BevelBorder.LOWERED));
        et5.setBackground(Color.CYAN);
        et5.setOpaque(true);
        et5.setVerticalAlignment(JLabel.TOP);
        et5.setFont(new Font("Font.BOLD", 2, 20));

        et6 = new JLabel("Etiqueta 6", JLabel.TRAILING);
        et6.setToolTipText("Etiqueta 6 ToolTip");
        et6.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(Color.red, 5, true), "TITLE"),
                new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new SoftBevelBorder(SoftBevelBorder.LOWERED))));
        et6.setBackground(Color.PINK);
        et6.setOpaque(true);

        et7 = new JLabel("Etiqueta 7", JLabel.LEFT);
        et7.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        et7.setForeground(Color.white);
        et7.setVerticalAlignment(JLabel.BOTTOM);
        et7.setBackground(Color.MAGENTA);
        et7.setOpaque(true);

        et8 = new JLabel("Etiqueta 8", new ImageIcon("Ejemplos\\imagen\\DogCh.gif"), JLabel.CENTER);
        et8.setToolTipText("Etiqueta 8 ToolTip");
        et8.setBackground(Color.blue);
        et8.setOpaque(true);
        et8.setForeground(Color.white);
        add(et1);
        add(et2);
        add(et3);
        add(et4);
        add(et5);
        add(et6);
        add(et7);
        add(et8);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Etiquetas8();
    }
}
