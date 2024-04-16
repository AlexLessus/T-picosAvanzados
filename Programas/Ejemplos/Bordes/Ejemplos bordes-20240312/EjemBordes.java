import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class EjemBordes extends JPanel {
  public EjemBordes() {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    setLayout(new GridLayout(4, 3, 20, 20));
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
    b7.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.pink, Color.blue));

    b8 = new JButton("LineBorder");
    b8.setBorder(new LineBorder(Color.green, 5, true));

    b9 = new JButton("TitledBorder");
    b9.setBorder(new TitledBorder(new LineBorder(Color.red, 10, true), "Titlulo"));

    b10 = new JButton("MatteBorder");
    b10.setBorder(new MatteBorder(15, 15, 15, 15, Color.yellow));

    b11 = new JButton("Compound");
    b11.setBorder(
        new CompoundBorder(
            new TitledBorder(new LineBorder(Color.gray, 5, true), "Titlulo"),
            new CompoundBorder(
                new EmptyBorder(10, 10, 10, 10),
                new SoftBevelBorder(SoftBevelBorder.LOWERED))));
    b12 = new JButton("Normal, sin borde");
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

  public static void main(String arg[]) {
    JFrame f = new JFrame("Bordes");
    EjemBordes p = new EjemBordes();
    // p.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    // p.setBorder(BorderFactory.createLineBorder(Color.magenta));
    p.setBorder(new CompoundBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20),
        BorderFactory.createLineBorder(Color.magenta)));
    f.add(p);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}