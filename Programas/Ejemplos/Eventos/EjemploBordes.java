import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class EjemploBordes extends JPanel {
    public EjemploBordes() {
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

        b1 = new JButton("BevelBorder RAISED");
        b1.setBorder(new BevelBorder(BevelBorder.RAISED));
        b2 = new JButton("BevelBorder LOWERED");
        b2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        b3 = new JButton("SoftBevelBorder");
        b3.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        b4 = new JButton("EmptyBorder");
        b4.setBorder(new EmptyBorder(25, 15, 5, 5));
        b5 = new JButton("EtchedBorder LOWERED");
        b5.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        b6 = new JButton("EtchedBorder RAISED");
        b6.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        b7 = new JButton("EtchedBorder RAISED red/blue");
        b7.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        b8 = new JButton("LineBorder");
        b8.setBorder(new LineBorder(Color.RED, 5, true));
        b9 = new JButton("TitleBorder");
        b9.setBorder(new TitledBorder(new LineBorder(Color.red, 6, true)));
        b10 = new JButton("MatteBorrder");
        b10.setBorder(new MatteBorder(15, 15, 5, 5, Color.red));
        b11 = new JButton("Compound Border");
        b11.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(Color.red, 5, true), "TITLE"),
                new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new SoftBevelBorder(SoftBevelBorder.LOWERED))));
        b12 = new JButton("Default JButton");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        EjemploBordes p = new EjemploBordes();
        p.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        f.add(p);
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
